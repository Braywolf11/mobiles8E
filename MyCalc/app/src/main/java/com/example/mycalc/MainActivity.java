package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display= findViewById(R.id.tctdisplay);
    }
    public void btn7(View view){
        display.setText("7");
    }

    public void btnAC(View view){
        display.setText("0");
    }
}
