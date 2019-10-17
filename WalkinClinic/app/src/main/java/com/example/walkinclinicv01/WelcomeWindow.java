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

        //saving name value to display
        Intent i1 = getIntent();
        String displayName = i1.getStringExtra(RegistrationWindow.NAME);
        TextView textView1 = (TextView) findViewById(R.id.firstName);
        textView1.setText(displayName);

        //saving role value to display
        Intent i2 = getIntent();
        String displayRole = i2.getStringExtra("id");
        //TextView textView2 = (TextView) findViewById(R.id.firstName);
        //textView2.setText(displayName);
    }


}
