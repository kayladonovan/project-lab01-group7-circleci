package com.example.walkinclinicv01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class SearchByProvidedServices extends AppCompatActivity implements View.OnClickListener{


    private DatabaseReference mRef;
    Query query;

    Query query3;


    Query query4;

    EditText editTextServiceName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_by_provided_services);
        findViewById(R.id.cancelBtn);
        findViewById(R.id.searchBtn);

        editTextServiceName=(EditText)findViewById(R.id.searchProvidedServices);

        //Query query2 = FirebaseDatabase.getInstance().getReference("Clinics").orderByChild("Services Offered").equalTo(editTextServiceName.toString());

        //Query query;

    }

    /*

    private void searchByService(){



        String serviceToCheck=editTextServiceName.getText().toString().trim();
        //hbm






        mRef= FirebaseDatabase.getInstance().getReference();

        query=mRef.child("Clinics").orderByChild("Services Offered").equalTo(serviceToCheck);


        query3=FirebaseDatabase.getInstance().getReference("Clinics").child("Services Offered").orderByChild("Services Offered").equalTo(editTextServiceName.toString());


        query4=FirebaseDatabase.getInstance().getReference("Clinics").orderByChild("Services Offered").equalTo(editTextServiceName.toString());


        //query=FirebaseDatabase.getInstance().getReference("Clinics").orderByChild("Services Offered").equalTo(editTextServiceName.toString());

        ValueEventListener valueEventListener= new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {


                for(DataSnapshot ds: dataSnapshot.getChildren()){
                    String key= ds.getKey();
                    Log.d("Clinics found",key);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

                Log.d("No Result Found", databaseError.getMessage());
                startActivity(new Intent(SearchByProvidedServices.this,SearchByProvidedServices.class));

            }


        };

        query.addListenerForSingleValueEvent(valueEventListener);


        //Intent i= new Intent(SearchByProvidedServices.this, ListOfClinics.class);

        //startActivity(i);



    }

     */


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cancelBtn:
                startActivity(new Intent(SearchByProvidedServices.this, ClinicSearch.class));
                break;

            case R.id.searchBtn:

                //searchByService();

                //Intent i= new Intent(SearchByProvidedServices.this, ListOfClinics.class);

                //startActivity(i);

                //startActivity(new Intent(SearchByProvidedServices.this, Recycler.class));

                String serviceToCheck=editTextServiceName.getText().toString().trim();

                Intent service=new Intent(SearchByProvidedServices.this, Recycler2.class);

                service.putExtra("Services Offered", serviceToCheck);

                startActivity(service);




                break;
        }
    }
}
