package com.example.Timeline.models;

public enum Temas {
    Creacion("Mitos de la creacion"),
    Roma("Historia del Imperio Romano"),
    America("Conquista de America");

    private final String nombre;

    Temas(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
