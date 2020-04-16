package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class admin_mainactivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    Window window;
    private Button VendorCreation;
    private Button VendorList;
    private Button Menu;
    private Button Report;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mainactivity);
        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.darkerblue));

        VendorCreation = (Button)findViewById(R.id.ButtonVendorCreation1);
        VendorList = (Button)findViewById(R.id.ButtonListofVendors1);
        Menu = (Button)findViewById(R.id.ButtonMenuCreation1);
        Report = (Button)findViewById(R.id.ButtonReports1);

        VendorCreation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(admin_mainactivity.this, VendorCreation.class));
                finish();
            }
        });


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
                startActivity(new Intent(admin_mainactivity.this , MainActivity.class));
            }
        }
        return super.onOptionsItemSelected(item);
    }


}



