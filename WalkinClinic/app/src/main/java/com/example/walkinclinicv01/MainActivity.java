package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    /*private Button signInButton;
    private Button registerButton;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToRegisterWindow(View view) {
        Intent intent = new Intent( MainActivity.this, RegistrationWindow.class);
        startActivity(intent);
    }

    public void checkLogin(View view){
        //go to firebase verification
    }
}
