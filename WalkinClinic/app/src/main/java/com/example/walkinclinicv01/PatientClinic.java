package com.example.walkinclinicv01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class PatientClinic extends AppCompatActivity implements View.OnClickListener{

    FirebaseAuth mAuth;
    FirebaseUser mUser;
    DatabaseReference myRef;
    DatabaseReference myRef1;
    DatabaseReference myRef2;
    TextView clinicName;
    TextView waitTimeHoursTextView;
    TextView waitTimeMinsTextView;
    String uid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_clinic);
        clinicName = (TextView)findViewById(R.id.clinicName);
        waitTimeHoursTextView = (TextView)findViewById(R.id.waitTimeInHours);
        waitTimeMinsTextView = (TextView)findViewById(R.id.waitTimeInMins);

        findViewById(R.id.checkInBtn).setOnClickListener(this);
        findViewById(R.id.bookBtn).setOnClickListener(this);
        findViewById(R.id.rateBtn).setOnClickListener(this);
        findViewById(R.id.goBackBtn).setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        myRef = FirebaseDatabase.getInstance().getReference();



        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            uid = extras.getString("ID");
        }else{
            uid = "";
        }

        myRef.child("Clinics").child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
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

    private void checkingIn(){
        myRef1 = FirebaseDatabase.getInstance().getReference();
        myRef1.child("Clinics").child(uid).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(!dataSnapshot.hasChild("WaitTimes")){      //Create new instance of WaitTimes
                    WaitTimes waitTime = new WaitTimes(1,15,0,15);
                    //waitTime.getHoursandMins();
                    myRef1.child("Clinics").child(uid).child("WaitTimes").setValue(waitTime).addOnCompleteListener(PatientClinic.this,
                            task -> {
                                    if(task.isSuccessful()){
                                        //System.out.println(waitTime.getWaitTimeTotal());
                                        updateWaitingTimes(waitTime);
                                        //startActivity(new Intent(PatientClinic.this,ClinicSearch.class));
                                        //waitTimeTextView.setText(waitTime.getWaitTimeTotal());
                                    } else{
                                        System.out.println("Not successful! ");
                                    }
                            });
                } else{
                    myRef2 = FirebaseDatabase.getInstance().getReference();
                    WaitTimes waitTime = dataSnapshot.child("WaitTimes").getValue(WaitTimes.class);
                    waitTime.increaseNumPeople();

                    WaitTimes updatedWaitTimes = new WaitTimes(waitTime.getNumPeopleWaiting(),waitTime.getWaitTimeTotal(),waitTime.getWaitTimeHours(),waitTime.getWaitTimeMins());
                    myRef2.child("Clinics").child(uid).child("WaitTimes").setValue(updatedWaitTimes).addOnCompleteListener(PatientClinic.this,
                            task1 -> {
                                if(task1.isSuccessful()){
                                    updateWaitingTimes(updatedWaitTimes);
                                    //System.out.println(updatedWaitTimes.getWaitTimeTotal());
                                    //startActivity(new Intent(PatientClinic.this,ClinicSearch.class));
                                }
                            });
                    //System.out.println(waitTime.getWaitTimeTotal());
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    private void updateWaitingTimes(WaitTimes waitTimes){
        waitTimeHoursTextView.setText(String.valueOf(waitTimes.getWaitTimeHours()));
        waitTimeMinsTextView.setText(String.valueOf(waitTimes.getWaitTimeMins()));
    }

    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.checkInBtn:
                checkingIn();
                break;
            case R.id.bookBtn:
                break;
            case R.id.rateBtn:
                break;
            case R.id.goBackBtn:
                startActivity(new Intent(PatientClinic.this,ClinicSearch.class));
                break;
        }
    }
}
