package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class employee extends AppCompatActivity {
    EditText _Name3,  _Password3;
    Button _Login3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee);
        _Name3 = (EditText)findViewById(R.id.Name3) ;
        _Password3 = (EditText)findViewById(R.id.Password3);
        _Login3 = (Button)findViewById(R.id.Login3);

    }
}
