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

public class employee extends AppCompatActivity {
    private EditText _Name3,  _Password3;
    private Button _Login3;
    private FirebaseAuth firebaseAuth;
    private ProgressDialog progressDialog;
Window window;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        _Name3 = (EditText)findViewById(R.id.Name3) ;
        _Password3 = (EditText)findViewById(R.id.Password3);
        _Login3 = (Button)findViewById(R.id.Login3);

        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.blue));


        firebaseAuth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);

        FirebaseUser user = firebaseAuth.getCurrentUser();

        if(user!= null){
            finish();
            startActivity(new Intent(employee.this, employee_mainactivity.class));
        }
        _Password3.setTransformationMethod(HideReturnsTransformationMethod.getInstance());


        _Login3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(_Name3.getText().toString(), _Password3.getText().toString());
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

                    startActivity(new Intent(employee.this, employee_mainactivity.class));
                    Toast.makeText(employee.this,"Login Successful", Toast.LENGTH_SHORT).show();
                    finish();
                }else{
                    progressDialog.dismiss();
                    Toast.makeText(employee.this,"Login Unsuccessful", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }


}
