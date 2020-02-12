package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class vendor extends AppCompatActivity {
    private EditText _Name2, _Password2;
    private Button _Login2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor);
        _Name2=(EditText)findViewById(R.id.Name2);
        _Password2=(EditText)findViewById(R.id.Password2);
        _Login2=(Button)findViewById(R.id.Login2);

    }
}
