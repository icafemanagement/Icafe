package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class admin extends AppCompatActivity {
private EditText _Name1, _Password1;
private Button _ButtonLogin1;
Window window;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        _Password1=(EditText)findViewById(R.id.Password1);
        _Name1=(EditText)findViewById(R.id.Name1);
        _ButtonLogin1=(Button)findViewById(R.id.ButtonLogin1);

        window = this.getWindow();
        window.setStatusBarColor(this.getColor(R.color.blue));

    }
}
