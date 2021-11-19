package com.backend.automationfilms;

import org.springframework.data.repository.CrudRepository;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface FilmRepository extends CrudRepository<Award, Integer> {

}
