package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;

public class employee_mainactivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
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
    {

        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.LogoutMenu:{
                firebaseAuth.signOut();
                finish();
                startActivity(new Intent(employee_mainactivity.this , MainActivity.class));
            }
        }
        return super.onOptionsItemSelected(item);
    }
}

