package com.example.Timeline.models;

public class Evento {
    private int id;
    private int[] años;
    private String tema;
    private String nombre;
    private String descripcion;

    public Evento(int id, int[] años, String tema, String nombre, String descripcion) {
        this.id = id;
        this.años = años;
        this.tema = tema;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public int[] getAños() {
        return años;
    }

    public String getTema() {
        return tema;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}

