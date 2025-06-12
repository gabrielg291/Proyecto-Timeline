package com.example.Timeline.services;

import com.example.Timeline.models.Evento;
import com.example.Timeline.repositories.RepositorioEvento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEvento {
    private final RepositorioEvento repositorioEvento;

    @Autowired
    public ServicioEvento(RepositorioEvento repositorioEvento) {
        this.repositorioEvento = repositorioEvento;
    }

    public Evento crearEvento(Long id, int[] anios, String tema, String nombre, String descripcion){


        return new Evento(id, anios, tema,nombre,descripcion);

    }
}
