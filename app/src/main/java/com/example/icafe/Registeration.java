package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Registeration extends AppCompatActivity {

    Window window;
    private EditText username;
    private EditText Email;
    private EditText Password;
    private Button register;
    private TextView back;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        username = (EditText) findViewById(R.id.UsernameRegister);
        Email = (EditText) findViewById(R.id.EmailRegister);
        Password = (EditText) findViewById(R.id.PasswordRegister);
        register = (Button) findViewById(R.id.RegisterButton);
        back = (TextView) findViewById(R.id.BackRegister);


        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.blue));






       back.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View view){
               startActivity(new Intent(Registeration.this, MainActivity.class));
           }
       });


        firebaseAuth = FirebaseAuth.getInstance();

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (validate()) {

                    String user_email = Email.getText().toString().trim();
                    String user_password = Password.getText().toString().trim();

                    firebaseAuth.createUserWithEmailAndPassword(user_email,user_password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if(task.isSuccessful()){
                                Toast.makeText(Registeration.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Registeration.this, MainActivity.class));
                            }else{
                                Toast.makeText(Registeration.this, "Registration Unsuccessful", Toast.LENGTH_SHORT).show();
                            }}
                    });

                }
            }
        });

    }




    private Boolean validate(){
        Boolean result = false;
        String name = username.getText().toString();
        String password = Password.getText().toString();
        String email = Email.getText().toString();

        if(name.isEmpty() || password.isEmpty() || email.isEmpty()){
            Toast.makeText(this, "Please Enter All The Details", Toast.LENGTH_SHORT).show();

        }else{
            result = true;
            finish();
        }

        return result;
    }


}
