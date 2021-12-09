package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface AwardCategoryRepository extends CrudRepository<AwardCategory, Integer> {

    @Query("SELECT a FROM AwardCategory a WHERE a.name = ?1 ORDER BY a.year DESC")
    List<AwardCategory> findAwardCategoryByName(String name);

    @Query("SELECT a FROM AwardCategory a WHERE a.name = ?1 AND a.year = ?2")
    List<AwardCategory> findAwardCategoryByNameAndYear(String name, int year);

    @Query("SELECT a FROM AwardCategory a WHERE a.id = ?1")
    List<AwardCategory> findAwardCategoryById(int id);

    @Query("SELECT a FROM AwardCategory a WHERE a.year = ?1")
    List<AwardCategory> findAwardCategoryByYear(int year);
}
