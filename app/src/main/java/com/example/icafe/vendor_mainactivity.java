package com.example.icafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class vendor_mainactivity extends AppCompatActivity {
    private Button _menuselectionbutton ,_imagepricebutton ,_reportbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendor_mainactivity);
        _menuselectionbutton = (Button)findViewById(R.id.menuselectionbutton);
        _imagepricebutton = (Button)findViewById(R.id.imagepricebutton);
        _reportbutton = (Button)findViewById(R.id.reportbutton);
    }
}
