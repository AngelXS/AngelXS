package com.example.angelxs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Saludo extends AppCompatActivity {
    private TextView mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        mensaje = findViewById(R.id.textView);
    }

    public void Saludar(View v) {
        mensaje.setText("HOLA LO QUE SEA");
    }
}
