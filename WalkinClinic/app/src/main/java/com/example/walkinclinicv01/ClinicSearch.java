package com.example.walkinclinicv01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class ClinicSearch extends AppCompatActivity implements View.OnClickListener{

    EditText editTextClinicName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_search);
        findViewById(R.id.searchAddressBtn).setOnClickListener(this);
        findViewById(R.id.searchHoursBtn).setOnClickListener(this);
        findViewById(R.id.searchServiceBtn).setOnClickListener(this);
        findViewById(R.id.searchDirectlyBtn).setOnClickListener(this);
        findViewById(R.id.logOut1).setOnClickListener(this);

        editTextClinicName = (EditText) findViewById(R.id.searchClinic);
    }

    private void searchforClinic(){
        String searchClinic = editTextClinicName.getText().toString().trim();
        String uid = "sVE1b39QhjdKjrPtde1WuX2sYKM2";
        Intent i = new Intent(ClinicSearch.this,PatientClinic.class);
        i.putExtra("ID",uid);
        startActivity(i);
        //startActivity(new Intent(ClinicSearch.this,PatientClinic.class));
    }
    //Adapted to allow for patient functionality
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.searchAddressBtn:
                startActivity(new Intent(ClinicSearch.this,SearchByAddress.class));
                break;

            case R.id.searchHoursBtn:
                startActivity(new Intent(ClinicSearch.this,SearchByHours.class));
                break;

            case R.id.searchServiceBtn:
                startActivity(new Intent(ClinicSearch.this,SearchByProvidedServices.class));
                break;
            case R.id.searchDirectlyBtn:
                searchforClinic();
                break;

            case R.id.logOut1:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ClinicSearch.this,MainActivity.class));
        }
    }
}
