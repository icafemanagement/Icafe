package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class vendor extends AppCompatActivity {
    private EditText _Name2, _Password2;
    private Button _Login2;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
    Window window;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);
        _Name2=(EditText)findViewById(R.id.Name2);
        _Password2=(EditText)findViewById(R.id.Password2);
        _Login2=(Button)findViewById(R.id.Login2);

        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.blue));

        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        FirebaseUser user = firebaseAuth.getCurrentUser();

       if(user!= null){
           finish();
           startActivity(new Intent(vendor.this, vendor_mainactivity.class));
       }
       _Password2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());


        _Login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(_Name2.getText().toString(), _Password2.getText().toString());
            }
        });


    }

    private void validate(String Username, String Password){

        progressDialog.setMessage("Verification In Process");
        progressDialog.show();
        firebaseAuth.signInWithEmailAndPassword(Username, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();

                    startActivity(new Intent(vendor.this, vendor_mainactivity.class));
                    Toast.makeText(vendor.this,"Login Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    progressDialog.dismiss();
                    Toast.makeText(vendor.this,"Login Unsuccessful", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }

}