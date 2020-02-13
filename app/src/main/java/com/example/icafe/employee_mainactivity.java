package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class employee_mainactivity extends AppCompatActivity {
    private Button _recharge, _transaction;
    private ImageButton _imagebutton;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_mainactivity);
        _recharge = (Button)findViewById(R.id.recharge);
        _transaction = (Button)findViewById(R.id.transaction);
        _imagebutton = (ImageButton)findViewById(R.id.imagebutton);
    }
}
