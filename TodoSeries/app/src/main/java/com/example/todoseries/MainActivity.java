package com.example.todoseries;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.SearchView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SerieAdapter adapter;
    private List<Serie> listaSerie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchView searchView = (SearchView) findViewById(R.id.searchView);
        searchView.setQueryHint("Buscar");
        searchView.setBackgroundColor(getColor(R.color.colorClaro));
        int searchTextId = searchView.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
        TextView searchText  = searchView.findViewById(searchTextId);
        if (searchText!=null) {
            searchText.setTextColor(Color.BLACK);
            searchText.setHintTextColor(Color.BLACK);
        }

        recyclerView = (RecyclerView) findViewById(R.id.listadoSeries);
        listaSerie = new ArrayList<>();
        adapter = new SerieAdapter(this, listaSerie);





        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);

        listaSerie.add(new Serie("The Umbrella Academy",R.drawable.serie1));
        listaSerie.add(new Serie("Sex Education",R.drawable.serie2));
        listaSerie.add(new Serie("Sabrina",R.drawable.serie3));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie4));
        listaSerie.add(new Serie("Hora de aventura",R.drawable.serie5));
        listaSerie.add(new Serie("Bojack Horseman",R.drawable.serie6));
        listaSerie.add(new Serie("South Park",R.drawable.serie7));
        listaSerie.add(new Serie("Juego de tronos",R.drawable.serie8));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie9));
        listaSerie.add(new Serie("House",R.drawable.serie10));
        listaSerie.add(new Serie("Arrow",R.drawable.serie11));
        listaSerie.add(new Serie("Supergirl",R.drawable.serie12));
        listaSerie.add(new Serie("Pablo Escobar",R.drawable.serie13));
        listaSerie.add(new Serie("Glee",R.drawable.serie14));
        listaSerie.add(new Serie("Greys Anatomy",R.drawable.serie15));
        listaSerie.add(new Serie("Orange is the new Black",R.drawable.serie16));
        listaSerie.add(new Serie("Lost",R.drawable.serie17));
        listaSerie.add(new Serie("Los Simpsons",R.drawable.serie18));
        listaSerie.add(new Serie("The Umbrella Academy",R.drawable.serie1));
        listaSerie.add(new Serie("Sex Education",R.drawable.serie2));
        listaSerie.add(new Serie("Sabrina",R.drawable.serie3));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie4));
        listaSerie.add(new Serie("Hora de aventura",R.drawable.serie5));
        listaSerie.add(new Serie("Bojack Horseman",R.drawable.serie6));
        listaSerie.add(new Serie("South Park",R.drawable.serie7));
        listaSerie.add(new Serie("Juego de tronos",R.drawable.serie8));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie9));
        listaSerie.add(new Serie("House",R.drawable.serie10));
        listaSerie.add(new Serie("Arrow",R.drawable.serie11));
        listaSerie.add(new Serie("Supergirl",R.drawable.serie12));
        listaSerie.add(new Serie("Pablo Escobar",R.drawable.serie13));
        listaSerie.add(new Serie("Glee",R.drawable.serie14));
        listaSerie.add(new Serie("Greys Anatomy",R.drawable.serie15));
        listaSerie.add(new Serie("Orange is the new Black",R.drawable.serie16));
        listaSerie.add(new Serie("Lost",R.drawable.serie17));
        listaSerie.add(new Serie("Los Simpsons",R.drawable.serie18));
        listaSerie.add(new Serie("The Umbrella Academy",R.drawable.serie1));
        listaSerie.add(new Serie("Sex Education",R.drawable.serie2));
        listaSerie.add(new Serie("Sabrina",R.drawable.serie3));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie4));
        listaSerie.add(new Serie("Hora de aventura",R.drawable.serie5));
        listaSerie.add(new Serie("Bojack Horseman",R.drawable.serie6));
        listaSerie.add(new Serie("South Park",R.drawable.serie7));
        listaSerie.add(new Serie("Juego de tronos",R.drawable.serie8));
        listaSerie.add(new Serie("American Horror Story",R.drawable.serie9));
        listaSerie.add(new Serie("House",R.drawable.serie10));
        listaSerie.add(new Serie("Arrow",R.drawable.serie11));
        listaSerie.add(new Serie("Supergirl",R.drawable.serie12));
        listaSerie.add(new Serie("Pablo Escobar",R.drawable.serie13));
        listaSerie.add(new Serie("Glee",R.drawable.serie14));
        listaSerie.add(new Serie("Greys Anatomy",R.drawable.serie15));
        listaSerie.add(new Serie("Orange is the new Black",R.drawable.serie16));
        listaSerie.add(new Serie("Lost",R.drawable.serie17));
        listaSerie.add(new Serie("Los Simpsons",R.drawable.serie18));


        adapter.notifyDataSetChanged();
    }


}
