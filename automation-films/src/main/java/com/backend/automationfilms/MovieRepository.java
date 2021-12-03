package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface MovieRepository extends CrudRepository<Movie, Integer> {

    @Query("SELECT m FROM Movie m WHERE m.name = ?1 AND m.year = ?2")
    Collection<Movie> findMovieByNameAndYear(String name, int year);

}

