package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DeleteServiceFromProfile extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_service_from_profile);

        findViewById(R.id.deleteBtn).setOnClickListener(this);
        findViewById(R.id.cancelBtn).setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /*case R.id.createBtn:
                break;*/
            case R.id.cancelBtn:
                startActivity(new Intent(DeleteServiceFromProfile.this, ClinicServicesScreen.class));
                break;
        }}
}
