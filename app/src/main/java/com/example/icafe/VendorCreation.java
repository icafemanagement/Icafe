package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.auth.User;

import java.lang.reflect.Member;
import java.util.HashMap;

public class VendorCreation extends AppCompatActivity {

 private EditText name2, email2,password2,phone2;
 private Button create;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_creation);

        name2 = (EditText)findViewById(R.id.editText);
        email2 = (EditText)findViewById(R.id.editText2);
        password2 = (EditText)findViewById(R.id.editText3);
        phone2 = (EditText)findViewById(R.id.editText4);
        create = (Button) findViewById(R.id.button);


        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HashMap<String,Object> map = new HashMap<>();
                map.put("Name",name2.getText().toString());
                map.put("Email",email2.getText().toString());
                map.put("Password",password2.getText().toString());
                map.put("Phone",phone2.getText().toString());

                FirebaseDatabase.getInstance().getReference().child("Vendors")
                        .setValue(map)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {

                                if(task.isSuccessful()) {
                                    Toast.makeText(VendorCreation.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(VendorCreation.this, vendor_mainactivity.class));
                                    Toast.makeText(VendorCreation.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                }


                            }
                        });

            }
        });


    }




    }



