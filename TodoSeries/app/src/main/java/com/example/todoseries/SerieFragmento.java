package com.example.todoseries;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SerieFragmento extends Fragment {

    private ExpandableListView expandableListView;
    private EpisodioAdapter episodioAdapter;
    private ArrayList<String> nombreEpisodios;
    private Map<String,String> descripcionEpisodios;


    public SerieFragmento() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_serie,container,false);

        expandableListView=(ExpandableListView) view.findViewById(R.id.expandableEpisodios);
        nombreEpisodios=new ArrayList<>();
        descripcionEpisodios=new HashMap<>();
       cargarDatos();


        return view;
    }


    private void cargarDatos(){

        nombreEpisodios.add("El país de octubre");
        nombreEpisodios.add("El bautismo oscuro");
        nombreEpisodios.add("El Juicio de Sabrina Spellman");
        nombreEpisodios.add("La academia de las brujas");

        descripcionEpisodios.put(nombreEpisodios.get(0),"Mientras Greendale se prepara para un eclipse de Halloween, Sabrina debe" +
                "tomar una decisión muy difícil, y Harvey hace una declaración inesperada.");
        descripcionEpisodios.put(nombreEpisodios.get(1),"La funerarioa Spellman recibe una visita legendaria, Ambrose investiga un " +
                "nefasto descubrimiento, y Sabrina revela una noticia impactante al aquelarre.");
        descripcionEpisodios.put(nombreEpisodios.get(2),"Sabrina enfrenta un extenso legado de ocultamiento familiar. Harvey lucha contra una " +
                "tempestad en casa y confiesa un secreto de la infancia.");
        descripcionEpisodios.put(nombreEpisodios.get(3),"Sabrina se va de viaje de fin de semana. El padre Blackwood hace una pregunta" +
                "crucial. Roz y Susie improvisan una pijamada un tanto perturbadora.");

        episodioAdapter= new EpisodioAdapter(nombreEpisodios,descripcionEpisodios,getContext());
        expandableListView.setAdapter(episodioAdapter);




    }

}
