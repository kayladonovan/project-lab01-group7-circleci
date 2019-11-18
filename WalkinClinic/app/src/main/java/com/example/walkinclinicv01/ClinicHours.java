package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClinicHours extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clinic_hours);
        findViewById(R.id.cancelBtn4).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        switch(v.getId()){
            case R.id.cancelBtn4:
                startActivity(new Intent(this, ClinicServicesScreen.class));
                break;
        }
    }
}
