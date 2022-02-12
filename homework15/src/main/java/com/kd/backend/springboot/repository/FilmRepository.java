package com.kd.backend.springboot.repository;

import com.kd.backend.springboot.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface FilmRepository extends JpaRepository<Film, Long> {
    List<Film> findByYear(Long year);

    List<Film> findByTitleLike(String title);

    Set<Film> findByYearOrderByTitle(Long year);

    @Query(value = "SELECT * FROM film f WHERE f.release_year = :year AND f.rating like :rating", nativeQuery = true)
    Set<Film> findByYearAndRatingLike(Long year, String rating);
}
