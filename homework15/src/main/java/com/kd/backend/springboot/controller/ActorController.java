package com.kd.backend.springboot.controller;

import com.kd.backend.springboot.dto.ActorDTO;
import com.kd.backend.springboot.dto.FilmDTO;
import com.kd.backend.springboot.service.ActorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @Value("${spring.application.name}")
    private static String applicationName;

    private final Logger logger = LoggerFactory.getLogger(FilmController.class);

    @GetMapping("/{actorId}")
    public ActorDTO getById(@PathVariable Long actorId) {
        logger.info("Received a request to fetch Actor with id: {}", actorId);
        return actorService.getActorById(actorId);
    }

    @GetMapping("/name/{firstName}")
    public List<ActorDTO> getAllActor(@PathVariable String firstName) {
        logger.info("Received a request to fetch Actor with firstName: {}", firstName);
        return actorService.getActorByFirstName(firstName);
    }

    @GetMapping("/film/")
    public List<FilmDTO> getAllFilms(@PathParam("actor_id") Long id){
        logger.info("Received a request to films done by Actor with id: {}", id);
        return actorService.getFilmsOfActorById(id);
    }
}
