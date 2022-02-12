package com.kd.backend.springboot.service;

import com.kd.backend.springboot.dto.FilmDTO;

import java.util.List;
import java.util.Set;

public interface FilmService {
    List<FilmDTO> getFilmsOfYear(Long year, Integer limit);

    FilmDTO getFilmById(Long id);

    Set<FilmDTO> getFilmByTitle(String title);

    Set<FilmDTO> getFilmByYearAndRating(Long year, String rating);
}
