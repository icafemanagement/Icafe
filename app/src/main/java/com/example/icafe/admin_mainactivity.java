package com.example.icafe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.google.firebase.auth.FirebaseAuth;

public class admin_mainactivity extends AppCompatActivity {
    private FirebaseAuth firebaseAuth;
    Window window;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_mainactivity);
        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.darkerblue));
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


