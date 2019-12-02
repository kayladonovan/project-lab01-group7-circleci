package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchByHours extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_hours);
        findViewById(R.id.cancelBtn6);
        findViewById(R.id.searchBtn);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelBtn6:
                startActivity(new Intent(SearchByHours.this, ClinicSearch.class));
                break;

            case R.id.searchBtn:
                startActivity(new Intent(SearchByHours.this, ListOfClinics.class));
                break;
        }
    }
}