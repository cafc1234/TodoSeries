package com.example.todoseries;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class EpisodioAdapter extends BaseExpandableListAdapter {

    private ArrayList<String> listaNombreEpisodios;
    private Map<String, String> listaDescripcionEpisodios;
   private Context context;

    public EpisodioAdapter(ArrayList<String> listaNombreEpisodios, Map<String, String> listaDescripcionEpisodios, Context context) {
        this.listaNombreEpisodios = listaNombreEpisodios;
        this.listaDescripcionEpisodios = listaDescripcionEpisodios;
        this.context = context;
    }

    @Override
    public int getGroupCount() {
        return listaNombreEpisodios.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listaDescripcionEpisodios.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listaNombreEpisodios.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return listaDescripcionEpisodios.get(listaNombreEpisodios.get(childPosition));
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        String nombreEpisodio=(String) getGroup(groupPosition);
        convertView= LayoutInflater.from(context).inflate(R.layout.item_episodio,null);
        TextView textView = convertView.findViewById(R.id.tituloEpisodio);
        textView.setText(nombreEpisodio);
       return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        String descripcionEpisodio=(String) getChild(groupPosition,childPosition);
        convertView= LayoutInflater.from(context).inflate(R.layout.item_episodio_hijo,null);
        TextView textView = convertView.findViewById(R.id.textoHijo);
        textView.setText(descripcionEpisodio);
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
