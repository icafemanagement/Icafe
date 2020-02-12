package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {
    private Button admin;
    private Button vendor;
    private Button employee;
    private TextView login;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        admin = (Button)findViewById(R.id.AdminLogin);
        vendor = (Button)findViewById(R.id.VendorLogin);
        employee = (Button)findViewById(R.id.EmployeeLogin);
        login = (TextView)findViewById(R.id.LoginAs);
        register = (TextView)findViewById(R.id.Register);
    }




}
