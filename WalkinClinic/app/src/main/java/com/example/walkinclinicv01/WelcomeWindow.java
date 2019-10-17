package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeWindow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_window);

        //saving values to display (*need to also store user role*)
        Intent i1 = getIntent();
        String displayName = i1.getStringExtra(RegistrationWindow.NAME);
        TextView textView1 = (TextView) findViewById(R.id.firstName);

        textView1.setText(displayName);
    }


}
