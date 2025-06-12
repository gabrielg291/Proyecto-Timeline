package com.example.Timeline.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Timeline.models.Evento;

@RestController
public class Controlador_Eventos {

    private final ArrayList<Evento> eventos=new ArrayList<>();
    
    @RequestMapping(value= "evento")
    public Evento crearEvento(Long id, int[] anios, String tema, String nombre, String descripcion){
        Evento evento= new Evento(id, anios, tema,nombre,descripcion);
        eventos.add(evento);
        return evento;
    }

    @RequestMapping(value= "eventos")
    public ArrayList<String> listarEventos() {
        ArrayList<String> eventos = new ArrayList<>();
        this.eventos.forEach(evento -> eventos.add(evento.getNombre()));
        return eventos;
    }

    @RequestMapping(value= "temas")
    public ArrayList<String> listarTemas() {
        ArrayList<String> temas = new ArrayList<>();
        eventos.forEach(evento -> temas.add(evento.getTema()));
        return temas;
    }
}
