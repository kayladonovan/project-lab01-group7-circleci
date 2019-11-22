package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Rating extends AppCompatActivity implements View.OnClickListener{
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    DatabaseReference myRef;

    TextView clinicName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_rating);
            clinicName = (TextView)findViewById(R.id.clinicName);
            findViewById(R.id.rateBtn).setOnClickListener(this);
            findViewById(R.id.cancelBtn).setOnClickListener(this);

            mAuth = FirebaseAuth.getInstance();
            mUser = mAuth.getCurrentUser();
            myRef = FirebaseDatabase.getInstance().getReference();

            myRef.child("Clinics").child(mUser.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    Info info = dataSnapshot.child("Info").getValue(Info.class);

                    System.out.println(info.getName());
                    clinicName.setText(info.getName());
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }

        @Override
        public void onClick(View v){
            switch(v.getId()){
                case R.id.rateBtn:
                    break;

                case R.id.cancelBtn:
                    startActivity(new Intent(Rating.this,PatientClinic.class));
                    break;
            }
        }
}
