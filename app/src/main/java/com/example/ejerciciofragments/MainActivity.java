package com.example.ejerciciofragments;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PeliculaListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentPeliculas fragmentPeliculas = (FragmentPeliculas) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentPeliculas);

        fragmentPeliculas.setPeliculaListener(this);
    }

    @Override
    public void onPeliculaSeleccionada(Pelicula p) {
        boolean hayDetalle =
                (getSupportFragmentManager().findFragmentById(R.id.fragmentDetallePeliculas)!= null);
        if (hayDetalle) {
            ((FragmentDetallePeliculas)getSupportFragmentManager()
                    .findFragmentById(R.id.fragmentDetallePeliculas))
                    .mostrarDetalle(p);
        }else {
            Intent i = new Intent(this, ActivityDetalle.class);
            i.putExtra(ActivityDetalle.EXTRA_PELICULA, p);
            startActivity(i);
        }
    }
}
