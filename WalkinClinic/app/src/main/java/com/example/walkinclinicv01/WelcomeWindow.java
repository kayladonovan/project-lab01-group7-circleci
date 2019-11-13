package com.example.walkinclinicv01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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


public class WelcomeWindow extends AppCompatActivity {
    FirebaseAuth mAuth;
    FirebaseUser mUser;
    DatabaseReference mDatabase;

    TextView firstNameTextView;
    TextView roleTextView;

    Button userSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_window);

        firstNameTextView = (TextView) findViewById(R.id.textFirstName);
        roleTextView = (TextView) findViewById(R.id.textRole);

        mAuth = FirebaseAuth.getInstance();
        mUser = mAuth.getCurrentUser();
        mDatabase = FirebaseDatabase.getInstance().getReference();

        mDatabase.child("users").child(mUser.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Person person = dataSnapshot.getValue(Person.class);

                firstNameTextView.setText(person.getFirstName());
                roleTextView.setText(person.getRole());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        userSignOut = findViewById(R.id.SignOut);

        userSignOut.setOnClickListener(new View.OnClickListener(){
                                           @Override
                                           public void onClick(View view){
                                               FirebaseAuth.getInstance().signOut();
                                               startActivity(new Intent(WelcomeWindow.this, MainActivity.class));
                                           }
                                       }
        );

    }

}