package com.example.todoseries;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import maes.tech.intentanim.CustomIntent;

public class SerieAdapter extends RecyclerView.Adapter<SerieAdapter.MyViewHolder> {

    private Context mContext;
    private List<Serie> listaSerie;

    public SerieAdapter(Context mContext, List<Serie> listaSerie) {
        this.mContext = mContext;
        this.listaSerie = listaSerie;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.portada_serie, viewGroup, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final Serie serie = listaSerie.get(position);


        holder.elementView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(mContext,SecondActivity.class);

                mContext.startActivity(intent);

                CustomIntent.customType(mContext,"left-to-right");
            }
        });

        holder.nombre.setText(serie.getNombre());
        holder.portada.setImageResource(serie.getPortada());

    }

    @Override
    public int getItemCount() {
        return listaSerie.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView nombre;
        public ImageView portada;
        private View elementView;

        public MyViewHolder(@NonNull View view) {
            super(view);
            nombre = (TextView) view.findViewById(R.id.nombreSerie);
            portada = (ImageView) view.findViewById(R.id.portada);
            elementView = view;
        }
    }

    public void animateCircularReveal(View view) {
        int centerX = 0;
        int centerY = 0;
        int startRadius = 0;
        int endRadius = Math.max(view.getWidth(), view.getHeight());
        Animator animation = ViewAnimationUtils.createCircularReveal(view, centerX, centerY, startRadius, endRadius);
        view.setVisibility(View.VISIBLE);
        animation.start();
    }

    @Override
    public void onViewAttachedToWindow(MyViewHolder holder) {
        super.onViewAttachedToWindow(holder);
        animateCircularReveal(holder.itemView);
    }

}
