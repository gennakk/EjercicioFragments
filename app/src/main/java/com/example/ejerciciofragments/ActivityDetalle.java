package com.example.ejerciciofragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ActivityDetalle extends AppCompatActivity {

    public static final String EXTRA_PELICULA = "PELICULA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        FragmentDetallePeliculas detalle = (FragmentDetallePeliculas)getSupportFragmentManager().findFragmentById(R.id.fragmentDetallePeliculas);

        detalle.mostrarDetalle((Pelicula)getIntent().getSerializableExtra(EXTRA_PELICULA));
    }
}
