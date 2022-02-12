package com.kd.backend.springboot.controller;

import com.kd.backend.springboot.dto.FilmDTO;
import com.kd.backend.springboot.service.FilmService;
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
@RequestMapping("/api/film")
public class FilmController {
    @Autowired
    private FilmService filmService;

    @Value("${spring.application.name}")
    private static String applicationName;

    private final Logger logger = LoggerFactory.getLogger(FilmController.class);

    @GetMapping("/{filmId}")
    public FilmDTO getById(@PathVariable Long filmId) {
        logger.info("Recieved a request to fetch film with id: {}", filmId);
        return filmService.getFilmById(filmId);
    }

    @GetMapping("/")
    public List<FilmDTO> getAllFilms(@PathParam("year") Long year, @PathParam("limit") Integer limit) {
        return filmService.getFilmsOfYear(year, limit);
    }
}
