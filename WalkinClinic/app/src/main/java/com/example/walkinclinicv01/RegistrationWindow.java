package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegistrationWindow extends AppCompatActivity implements View.OnClickListener {

    private FirebaseAuth mAuth;
    private FirebaseDatabase mDatabase;
    private DatabaseReference myRef;

    FirebaseAuth mAuth2;
    FirebaseUser mUser;
    DatabaseReference mDatabase2;


    EditText editTextUserName, editTextPassword, editTextFirstName, editTextLastName, editTextConfirmation,editTextUserRole;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editTextUserName = (EditText) findViewById(R.id.username);
        editTextPassword = (EditText) findViewById(R.id.password);
        editTextFirstName = (EditText) findViewById(R.id.firstName);
        editTextLastName = (EditText) findViewById(R.id.lastName);
        editTextConfirmation = (EditText) findViewById(R.id.confirmPassword);
        editTextUserRole = (EditText) findViewById(R.id.userRole);



        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.logIn).setOnClickListener(this);

    }

    private void registerUser() {
        String FirstName = editTextFirstName.getText().toString().trim();
        String LastName = editTextLastName.getText().toString().trim();
        String username = editTextUserName.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        //String FirstName = editTextFirstName.getText().toString().trim();
        //String LastName = editTextLastName.getText().toString().trim();
        String confirmation = editTextConfirmation.getText().toString().trim();
        String userRole = editTextUserRole.getText().toString().trim();

        if (username.isEmpty()) {
            editTextUserName.setError("Email is required");
            editTextUserName.requestFocus();
            return ;
        }

        if (password.isEmpty()) {
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return ;
        }

        if (FirstName.isEmpty()) {
            editTextFirstName.setError("first name is required");
            editTextFirstName.requestFocus();
            return ;
        }
        if (LastName.isEmpty()) {
            editTextLastName.setError("last name is required");
            editTextLastName.requestFocus();
            return ;
        }
        if (confirmation.isEmpty()) {
            editTextConfirmation.setError("Password confirmation is required");
            editTextConfirmation.requestFocus();
            return ;
        }

        if (!Patterns.EMAIL_ADDRESS.matcher(username).matches()) {
            editTextUserName.setError("Please enter a valid email");
            editTextUserName.requestFocus();
            return ;
        }

        if (password.length() < 6) {
            editTextPassword.setError("Minimum length of password should be 6");
            editTextPassword.requestFocus();
            return ;
        }

        final Person person = new Person(userRole, FirstName, LastName, username);


        mAuth = FirebaseAuth.getInstance();
        mAuth.createUserWithEmailAndPassword(username, password);
        mAuth.signInWithEmailAndPassword(username,password);

        myRef = FirebaseDatabase.getInstance().getReference();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){ //Try logging in again
            System.out.println(user);
        }
        myRef.child("users").child(user.getUid()).setValue(person);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                registerUser();
                startActivity(new Intent(RegistrationWindow.this, WelcomeWindow.class));
                break;
            case R.id.logIn:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
