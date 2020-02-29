package com.example.training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class register_2 extends AppCompatActivity {
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_2);

        texto = (TextView) findViewById(R.id.textView);

    }
    public void cambiarMensaje(View v){
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        Date fechaActual = Calendar.getInstance().getTime();

        String s = formato.format(fechaActual);
        texto.setText(String.format("Botón presionado: %s", s));
    }
}
