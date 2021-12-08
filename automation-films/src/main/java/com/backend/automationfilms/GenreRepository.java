package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface GenreRepository extends CrudRepository<Genre, Integer> {

    @Query("SELECT g FROM Genre g WHERE g.name = ?1")
    Collection<Genre> findGenreByName(String name);

}
