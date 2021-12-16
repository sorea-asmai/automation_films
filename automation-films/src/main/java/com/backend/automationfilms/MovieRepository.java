package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface MovieRepository extends CrudRepository<Movie, Integer> {

    @Query("SELECT m FROM Movie m WHERE m.name = ?1 AND m.year = ?2")
    Collection<Movie> findMovieByNameAndYear(String name, int year);

    @Query("SELECT m FROM Movie m WHERE m.id = ?1")
    List<Movie> findMovieById(int id);

    @Query("SELECT m FROM Movie m WHERE m.name = ?1")
    List<Movie> findMovieByName(String name);

    @Query("SELECT m FROM Movie m WHERE m.name LIKE %?1%")
    List<Movie> findMovieByApproxName(String name);

    @Query("SELECT m FROM Movie m WHERE m.year = ?1")
    List<Movie> findMovieByYear(int year);

    @Query("SELECT m FROM Movie m JOIN m.genre g WHERE g.name = ?1")
    List<Movie> findMovieByGenre(String genreName);

    @Query("SELECT m FROM Movie m JOIN m.genre g WHERE g.id = ?1")
    List<Movie> findMovieByGenreId(int id);
}

