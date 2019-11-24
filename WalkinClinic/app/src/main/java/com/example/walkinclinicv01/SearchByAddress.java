package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.Query;
import android.util.Log;


public class SearchByAddress extends AppCompatActivity implements View.OnClickListener{

    private DatabaseReference mRef;
    private Query query;
    EditText search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_address);
        findViewById(R.id.cancelBtn7).setOnClickListener(this);
        findViewById(R.id.searchBtn).setOnClickListener(this);
    }

    //NEW
    protected void SearchByAddress(){

        String addressSearch = search.getText().toString().trim();

        mRef = FirebaseDatabase.getInstance().getReference();

        query = mRef.child("Clinics").orderByChild("address").equalTo(addressSearch);

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                for(DataSnapshot ds : dataSnapshot.getChildren()) {
                    String key = ds.getKey();
                    Log.d("Clinics found", key);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.d("No Results Found", databaseError.getMessage());
            }
        };
        query.addListenerForSingleValueEvent(valueEventListener);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelBtn7:
                startActivity(new Intent(SearchByAddress.this, ClinicSearch.class));
                break;

            case R.id.searchBtn:
                SearchByAddress();
                startActivity(new Intent(SearchByAddress.this, SearchByAddress.class));
                break;
        }
    }
}
