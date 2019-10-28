package com.example.ejerciciofragments;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;





public class FragmentDetallePeliculas extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_detalle_peliculas, container,false);
    }

    public void mostrarDetalle (Pelicula pelicula) {


        ImageView imageView = (ImageView)getView().findViewById((R.id.imageView));
        imageView.setImageResource(pelicula.getImagen());

        TextView textViewTitulo =(TextView)getView().findViewById(R.id.textViewTitulo);
        textViewTitulo.setText(pelicula.getTitulo());

        TextView textViewDirector =(TextView)getView().findViewById(R.id.textViewDirector);
        textViewDirector.setText(pelicula.getDirector());

        TextView textViewDuracion =(TextView)getView().findViewById(R.id.textViewDuracion);
        textViewDuracion.setText(pelicula.getDuracion().toString());

        TextView textViewResumen = (TextView) getView().findViewById(R.id.textViewResumen);
        textViewResumen.setText(pelicula.getResumen());
    }
}
