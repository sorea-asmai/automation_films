package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Integer> {

    @Query("SELECT p FROM Person p WHERE p.id = ?1")
    Collection<Person> findPersonById(int id);

    @Query("SELECT p FROM Person p WHERE p.firstName = ?1 AND p.lastName = ?2")
    Collection<Person> findPersonByName(String fname, String lname);

    @Query("SELECT p FROM Person p WHERE p.firstName = ?1")
    List<Person> findPersonByFname(String fname);

    @Query("SELECT p FROM Person p WHERE p.lastName = ?1")
    List<Person> findPersonByLname(String lname);

    @Query("SELECT p FROM Person p WHERE p.role = ?1")
    List<Person> findPersonByRole(String role);
}
