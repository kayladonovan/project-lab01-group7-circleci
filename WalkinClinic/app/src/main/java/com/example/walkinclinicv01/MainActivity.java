package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //onClick for clicking "Don't have an account? Register
    public void moveToRegisterWindow(View view) {
        Intent intent = new Intent(this, RegistrationWindow.class);
        startActivity(intent);
    }

    //onClick for Sign in
    public void checkLogin(View view){
        /* go to firebase verification
           create new intent (onClick - open welcome window) */
    }
}
