package com.example.walkinclinicv01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class EmployeeScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_screen);
        findViewById(R.id.createClinicBtn).setOnClickListener(this);
        findViewById(R.id.signOut2).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.createClinicBtn:
                startActivity(new Intent(EmployeeScreen.this,ProfileInformation.class));
                break;

            case R.id.signOut2:
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(EmployeeScreen.this,MainActivity.class));
                break;
        }
    }
}
