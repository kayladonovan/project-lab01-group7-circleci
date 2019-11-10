package com.example.walkinclinicv01;

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
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import android.os.Bundle;

public class AdminScreen extends AppCompatActivity implements View.OnClickListener {

    FirebaseAuth mAuth;
    FirebaseUser mUser;
    DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        findViewById(R.id.addBtn).setOnClickListener(this);
        findViewById(R.id.editBtn).setOnClickListener(this);
        findViewById(R.id.deleteBtn).setOnClickListener(this);
        findViewById(R.id.logout).setOnClickListener(this);
        findViewById(R.id.removeUser).setOnClickListener(this);
    }

    public void deleteAccount(){


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.addBtn:
                startActivity(new Intent(AdminScreen.this, AddService.class));
                break;
            case R.id.editBtn:
                startActivity(new Intent(AdminScreen.this, EditService.class));
                break;
            case R.id.deleteBtn:
                startActivity(new Intent(AdminScreen.this, DeleteService.class));
                break;
            case R.id.logout:
                startActivity(new Intent(AdminScreen.this, MainActivity.class));
                break;
            case R.id.removeUser:
                startActivity(new Intent(AdminScreen.this, RemoveAccount.class));
                break;
        }
    }
}
