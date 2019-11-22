package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SearchByAddress extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_address);
        findViewById(R.id.cancelBtn7);
        findViewById(R.id.searchBtn);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelBtn7:
                startActivity(new Intent(SearchByAddress.this, ClinicSearch.class));
                break;

            case R.id.searchBtn:
                startActivity(new Intent(SearchByAddress.this, ListOfClinics.class));
                break;
        }
    }


}
