package com.kd.backend.springboot.service;

import com.kd.backend.springboot.dto.ActorDTO;
import com.kd.backend.springboot.dto.FilmDTO;

import java.util.*;


public interface ActorService {
    List<FilmDTO> getFilmsOfActorById(Long id);

    ActorDTO getActorById(Long id);

    List<ActorDTO> getActorByFirstName(String firstName);
}
