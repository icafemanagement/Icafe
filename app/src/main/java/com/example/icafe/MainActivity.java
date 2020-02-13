package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class
MainActivity extends AppCompatActivity {
    private Button Admin;
    private Button Vendor;
    private Button Employee;
    private TextView Login;
    //private TextView register;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Admin = (Button)findViewById(R.id.AdminLogin);
        Vendor = (Button)findViewById(R.id.VendorLogin);
        Employee = (Button)findViewById(R.id.EmployeeLogin);
        Login = (TextView)findViewById(R.id.LoginAs);
        //register = (TextView)findViewById(R.id.Register);

        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.blue));


        Admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, admin.class));
            }
        });

        Vendor.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, vendor.class));
            }
        });

        Employee.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this, employee.class));
            }
        });




    }







}
