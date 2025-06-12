package com.example.Timeline.models;


import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "eventos")
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    private final int[] años;
    private final String tema;
    private final String nombre;

    @Column(nullable = true)
    private String descripcion;


    public Evento(Long id, int[] años, String tema, String nombre) {
        this.id = id;
        this.años = años;
        this.tema = tema;
        this.nombre = nombre;
    }

    public Evento(Long id, int[] años, String tema, String nombre, String descripcion) {
        this(id,años,tema,nombre);
        this.descripcion = descripcion;
    }

    public Long getId() {
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

    public void setDescripcion(String descripcion){
        this.descripcion= descripcion;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", años=" + Arrays.toString(años) +
                ", tema='" + tema + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}

