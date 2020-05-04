package com.example.demeterparadise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para ir a la seccion de registro(boton Registrar)

    public void iniciarRegistro(View view){
        Intent registro = new Intent(this, Registrarse.class);
        startActivity(registro);

    }
}
