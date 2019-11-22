package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchByProvidedServices extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_provided_services);
        findViewById(R.id.cancelBtn);
        findViewById(R.id.searchBtn);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelBtn:
                startActivity(new Intent(SearchByProvidedServices.this, ClinicSearch.class));
                break;

            case R.id.searchBtn:
                startActivity(new Intent(SearchByProvidedServices.this, ListOfClinics.class));
                break;
        }
    }
}
