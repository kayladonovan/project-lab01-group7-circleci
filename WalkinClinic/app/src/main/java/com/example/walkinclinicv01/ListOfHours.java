package com.example.walkinclinicv01;

import android.os.Bundle;
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

public class ListOfHours extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser mUser;
    DatabaseReference mDatabase;
    TextView openTime1, openTime2,openTime3,openTime4,openTime5,openTime6,openTime7,
        closeTime1, closeTime2,closeTime3,closeTime4,closeTime5,closeTime6,closeTime7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_hours);

        openTime1 = (TextView) findViewById(R.id.myStartTime1);
        openTime2 = (TextView) findViewById(R.id.myStartTime2);
        openTime3 = (TextView) findViewById(R.id.myStartTime3);
        openTime4 = (TextView) findViewById(R.id.myStartTime4);
        openTime5 = (TextView) findViewById(R.id.myStartTime5);
        openTime6 = (TextView) findViewById(R.id.myStartTime6);
        openTime7 = (TextView) findViewById(R.id.myStartTime7);
        closeTime1 = (TextView) findViewById(R.id.myEndTime1);
        closeTime2 = (TextView) findViewById(R.id.myEndTime2);
        closeTime3 = (TextView) findViewById(R.id.myEndTime3);
        closeTime4 = (TextView) findViewById(R.id.myEndTime4);
        closeTime5 = (TextView) findViewById(R.id.myEndTime5);
        closeTime6 = (TextView) findViewById(R.id.myEndTime6);
        closeTime7 = (TextView) findViewById(R.id.myEndTime7);


        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("Clinics").child(mUser.getUid()).child("Hours").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                WeeklySchedule weeklySchedule = dataSnapshot.getValue(WeeklySchedule.class);
                Hours mon = weeklySchedule.getMon();
                Hours tue = weeklySchedule.getTue();
                Hours wed = weeklySchedule.getWed();
                Hours thur = weeklySchedule.getThur();
                Hours fri = weeklySchedule.getFri();
                Hours sat = weeklySchedule.getSat();
                Hours sun = weeklySchedule.getSun();

                openTime1.setText(mon.getOpen());
                openTime2.setText(tue.getOpen());
                openTime3.setText(wed.getOpen());
                openTime4.setText(thur.getOpen());
                openTime5.setText(fri.getOpen());
                openTime6.setText(sat.getOpen());
                openTime7.setText(sun.getOpen());

                closeTime1.setText(mon.getClose());
                closeTime2.setText(tue.getClose());
                closeTime3.setText(wed.getClose());
                closeTime4.setText(thur.getClose());
                closeTime5.setText(fri.getClose());
                closeTime6.setText(sat.getClose());
                closeTime7.setText(sun.getClose());

                //roleTextView.setText(person.getRole());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
