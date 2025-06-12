package com.example.Timeline.repositories;

import com.example.Timeline.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEvento extends JpaRepository<Evento,Long> {

}
