package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registeration extends AppCompatActivity {

    Window window;
    private EditText username;
    private EditText email;
    private EditText password;
    private Button register;
    private TextView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        username = (EditText) findViewById(R.id.UsernameRegister);
        email = (EditText) findViewById(R.id.EmailRegister);
        password = (EditText) findViewById(R.id.PasswordRegister);
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
    }


}
