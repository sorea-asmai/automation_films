package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface AwardCategoryRepository extends CrudRepository<AwardCategory, Integer> {

    @Query("SELECT a FROM AwardCategory a WHERE a.name = ?1")
    Collection<AwardCategory> findAwardCategoryByName(String name);

    @Query("SELECT a FROM AwardCategory a WHERE a.name = ?1 AND a.year = ?2")
    Collection<AwardCategory> findAwardCategoryByNameAndYear(String name, int year);

}
