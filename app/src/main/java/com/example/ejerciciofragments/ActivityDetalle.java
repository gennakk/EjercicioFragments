package com.example.ejerciciofragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityDetalle extends AppCompatActivity {

    public static final String EXTRA_PELICULA = "PELICULA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Pelicula pelicula = (Pelicula)getIntent().getSerializableExtra(EXTRA_PELICULA);

        FragmentDetallePeliculas detalle = (FragmentDetallePeliculas) getSupportFragmentManager().findFragmentById(R.id.fragmentDetallePeliculas);
        findViewById(R.id.fragmentDetallePeliculas).setVisibility(View.VISIBLE);

        detalle.mostrarDetalle(pelicula);


    }
}
