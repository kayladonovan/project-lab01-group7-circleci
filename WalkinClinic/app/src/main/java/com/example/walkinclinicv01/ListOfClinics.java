package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;


//Creating x number of textViews based on the number of clinics in the Database.
//Will need to be adapted so that it only displays a narrowed number of clinics.
public class ListOfClinics extends AppCompatActivity {

    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    TextView ClinicNameTextView;

    DatabaseReference mClinics = myRef.child("Clinics"); //specific ref to Clinics in DB
    LinearLayout linearLayout; //needed for ref of where to put the textViews
    int numOfClinics; //counter for clinics
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_clinics);
        linearLayout = findViewById(R.id.linearLayout);

        /*Determines number of Clinics in the DB by calling getChildrenCount() and storing the value as an integer
        needed to determine the size of the for loop*/
        mClinics = FirebaseDatabase.getInstance().getReference().child("Clinics");

        //part that requires search
        //Query match = mClinics.orderByChild("").equalTo("");  //orderByChild() returns a new Query narrowed by the constraint
        mClinics.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange (@NonNull DataSnapshot dataSnapshot){
                numOfClinics = (int) dataSnapshot.getChildrenCount();
                addSearchResults();

                //Info info = dataSnapshot.child("Info").getValue(Info.class);
                //name = info.getName();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    //creates textViews based on numOfClinics
    private void addSearchResults() {
        LinearLayout textLinearLayout = new LinearLayout(this);
        textLinearLayout.setOrientation(LinearLayout.VERTICAL);

        linearLayout.addView(textLinearLayout);
        int size = numOfClinics;

        for (int i = 1; i <= size; i++) {
            Button select = new Button(this);
            select.setText("select"); //need to set text to clinic name
            select.setId(i);
            linearLayout.addView(select);
        }
    }
}
