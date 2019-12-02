package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class Recycler3 extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ClinicsAdapter adapter;
    private List<Clinic> clinicList;

    DatabaseReference mClinics;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler3);

        recyclerView = findViewById(R.id.recyclerView3);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        clinicList = new ArrayList<>();


        adapter = new ClinicsAdapter(this, clinicList);
        recyclerView.setAdapter(adapter);


        mClinics = FirebaseDatabase.getInstance().getReference("Clinics");



        Query nameMatches = FirebaseDatabase.getInstance().getReference("Clinics").child("Info").orderByChild("name").equalTo("MyTestClinic");
        nameMatches.addListenerForSingleValueEvent(valueEventListener);

    }

    ValueEventListener valueEventListener = new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {

            //clear old data in list
            clinicList.clear();

            if (dataSnapshot.exists()) {
                for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
                    Clinic clinic = snapshot.getValue(Clinic.class);
                    clinicList.add(clinic);
                }
                adapter.notifyDataSetChanged();
            }
        }

        @Override
        public void onCancelled(DatabaseError databaseError) {

        }
    };
}
