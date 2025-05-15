package com.example.Timeline.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Timeline.models.Evento;
import com.example.Timeline.models.Temas;

@RestController
public class Controlador_Eventos {

    @RequestMapping(value= "evento")
    public Evento crearEvento(){
        return new Evento(150, new int[]{-10000}, "Mitos de la creacion","Creación Zuhu",
                "Para la etnia zulú, Unkulunkulu emergió del vacío y creó la tierra a partir " +
                            "de dos rocas y les pidió a sus compañeros semidioses y a los dioses que, " +
                            "con ayuda de las hierbas, crearan a dos seres humanos: un hombre y una mujer.");
    }
}
