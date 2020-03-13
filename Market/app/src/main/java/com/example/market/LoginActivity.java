package com.example.market;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void BtnLogin(View view){
        //Toast.makeText(this, "you have pressed Login Button", Toast.LENGTH_SHORT).show();
        Intent actHome = new Intent(this,HomeActivity.class);
        startActivity(actHome);
    }

    public void BtnSingup(View view){
        //Toast.makeText(this, "Sing up", Toast.LENGTH_SHORT).show();
        Intent actRegister = new Intent(this,RegisterActivity.class);
        startActivity(actRegister);
    }
}
