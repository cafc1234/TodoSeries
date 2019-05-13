package com.example.todoseries;

public class Serie {
    private String nombre;
    private int portada;

    public Serie() {
    }

    public Serie(String nombre, int portada) {
        this.nombre = nombre;
        this.portada = portada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPortada() {
        return portada;
    }

    public void setPortada(int portada) {
        this.portada = portada;
    }
}
