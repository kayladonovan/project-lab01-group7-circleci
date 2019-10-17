package com.example.walkinclinicv01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;

public class RegistrationWindow extends AppCompatActivity {

    //constants created to store user's first name and their role
    public static final String NAME = "com.example.walkinclinicv01.extra.MESSAGE";
    public static final String ROLE = "com.example.walkinclinicv01.extra.MESSAGE";

    private EditText nameEditText;
    private EditText userRoleEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        //store first name of user
        nameEditText = (EditText)  findViewById(R.id.firstName);
    }

    //onClick method for clicking "Already a user? Sign in"
    public void moveToLoginWindow(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    //onClick for Sign up (successful registration)
    public void moveToWelcomeWindow(View view){
        //check if valid, then create new intent
        Intent intent = new Intent(this, WelcomeWindow.class);
        startActivity(intent);
        String userName = nameEditText.getText().toString();
    }

    //onClick for user role selection
    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        //check which radio button was selected
        switch(view.getId()) {
            case R.id.patientSelect:
                if (checked)
                    break;
            case R.id.employeeSelect:
                if (checked)
                    break;
        }
    }
}
