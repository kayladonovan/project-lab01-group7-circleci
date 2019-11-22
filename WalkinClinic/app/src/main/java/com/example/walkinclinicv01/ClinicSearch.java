package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class ClinicSearch extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_search);
        findViewById(R.id.searchAddressBtn).setOnClickListener(this);
        findViewById(R.id.searchHoursBtn).setOnClickListener(this);
        findViewById(R.id.searchServiceBtn).setOnClickListener(this);
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

            case R.id.logOut:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ClinicSearch.this,MainActivity.class));
        }
    }
}
