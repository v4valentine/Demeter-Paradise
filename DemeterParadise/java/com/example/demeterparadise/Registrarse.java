package com.example.demeterparadise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registrarse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    //Metodo para ir al inicio de session(boton registrarse)

    public void ValidarRegistro(View view){
        Intent registro = new Intent(this, MainActivity.class);
        startActivity(registro);

    }

}
