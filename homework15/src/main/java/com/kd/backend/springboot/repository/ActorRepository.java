package com.kd.backend.springboot.repository;

import com.kd.backend.springboot.entity.Actor;
import com.kd.backend.springboot.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface ActorRepository extends JpaRepository<Actor, Long> {

    List<Actor> findByFirstName(String firstName);

    @Query(value = "select f.film_id, f.title, f.description, f.release_year, f.rating\n" +
            "from actor a\n" +
            "inner join film_actor fa on fa.actor_id = a.actor_id\n" +
            "inner join film f on fa.film_id = f.film_id\n" +
            "where a.actor_id= :id ;", nativeQuery = true)
    List<Film> findFilmByYearActorId(Long id);
}
