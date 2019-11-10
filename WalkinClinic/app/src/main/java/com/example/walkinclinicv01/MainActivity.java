package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //private Button signInButton;
    //private Button registerButton
    EditText UserName, Password;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.register).setOnClickListener(this);
        findViewById(R.id.signIn).setOnClickListener(this);
        UserName = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);

        firebaseAuth = firebaseAuth.getInstance();

    }


    public void checkLogin(final View view) {
                firebaseAuth.signInWithEmailAndPassword(UserName.getText().toString(), Password.getText().toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            if (UserName.getText().toString().equals("qwe@gmail.com") && Password.getText().toString().equals("123456")) {
                                startActivity(new Intent(MainActivity.this, AdminScreen.class));
                            } else
                                startActivity(new Intent(MainActivity.this, WelcomeWindow.class));
                        } else {
                            Toast.makeText(MainActivity.this, "Invalid Entry", Toast.LENGTH_LONG).show();
                        }

                    }
                });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register:
                startActivity(new Intent(this,RegistrationWindow.class));
                break;
            case R.id.signIn:
                checkLogin(view);
                //startActivity(new Intent(this,WelcomeWindow.class));
                break;
        }

    }

}
