package com.kd.backend.springboot.mapper;

import com.kd.backend.springboot.dto.FilmDTO;
import com.kd.backend.springboot.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class FilmMapper {
    @Autowired
    private ActorMapper actorMapper;

    public FilmDTO fromEntity(Film entity) {
        FilmDTO film = new FilmDTO();
        film.setYear(entity.getYear());
        film.setFilmId(entity.getId());
        film.setRating(entity.getRating());
        film.setTitle(entity.getTitle());
        film.setDescription(entity.getDescription());
        film.setActors(entity.getActors().stream().map(actorMapper::fromEntity).collect(Collectors.toList()));
        return film;
    }
}
