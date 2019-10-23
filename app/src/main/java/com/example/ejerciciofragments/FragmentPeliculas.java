package com.example.ejerciciofragments;
;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.w3c.dom.Text;


public class FragmentPeliculas extends Fragment {

    private ListView lstPeliculas;

    private Pelicula[] datos ={new Pelicula("El Joker","Todd Phillips",123.0,R.drawable.eljoker),
            new Pelicula("Maléfica","Joachim Rønning",118.0,R.drawable.malefica),
            new Pelicula("La familia Addams"," Conrad Vernon, Greg Tiernan",105.0,R.drawable.lafamilaadams)};

    private PeliculaListener listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fragment_peliculas, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        lstPeliculas = (ListView)getView().findViewById(R.id.lstPeliculas);
        lstPeliculas.setAdapter(new AdaptadorPeliculas(this));
        lstPeliculas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                if (listener != null)
                    listener.onPeliculaSeleccionada((Pelicula)lstPeliculas.getAdapter().getItem(position));
            }});
    }


    public void setPeliculaListener (PeliculaListener listener){
        this.listener = listener;
    }


    class AdaptadorPeliculas extends ArrayAdapter<Pelicula> {
        Activity context;
        AdaptadorPeliculas(Fragment context) {
            super(context.getActivity(), R.layout.list_item_peliculas, datos);
            this.context = context.getActivity();
        }

        @NonNull
        @Override
        public View getView(int position,@Nullable View convertView,@NonNull ViewGroup parent) {
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.list_item_peliculas, null);

            ImageView imageViewPelicula = (ImageView) item.findViewById(R.id.imageViewPelicula);
            imageViewPelicula.setImageResource(datos[position].getImagen());

            TextView textViewTitulo = (TextView) item.findViewById(R.id.textViewTitulo);
            textViewTitulo.setText(datos[position].getTitulo());

            TextView textViewDirector = (TextView) item.findViewById(R.id.textViewDirector);
            textViewDirector.setText(datos[position].getDirector());

            TextView textViewDuracion = (TextView) item.findViewById(R.id.textViewDuracion);
            textViewDuracion.setText(datos[position].getDuracion().toString());

            return (item);
        }
    }





}
