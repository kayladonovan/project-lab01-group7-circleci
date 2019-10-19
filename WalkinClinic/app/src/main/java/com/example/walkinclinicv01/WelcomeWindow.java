package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class WelcomeWindow extends AppCompatActivity {

    Button userSignOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_window);

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
