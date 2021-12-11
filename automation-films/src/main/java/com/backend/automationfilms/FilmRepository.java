package com.backend.automationfilms;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

import com.backend.automationfilms.*;

// This will be AUTO IMPLEMENTED by Spring into a Bean called filmRepository
// CRUD refers Create, Read, Update, Delete

public interface FilmRepository extends CrudRepository<Nominated, Integer> {
    @Query("SELECT n FROM Nominated n WHERE n.awardCategory = ?1 AND n.movie = ?2")
    Collection<Nominated> findNominationByAwardAndMovie(AwardCategory award, Movie movie);

    @Query("SELECT DISTINCT n.movie FROM Nominated n JOIN AwardCategory a ON n.awardCategory.id=a.id WHERE a.name = ?1")
    List<Movie> findAllMoviesByAward(String awardName);

    @Query("SELECT DISTINCT n.movie FROM Nominated n JOIN AwardCategory a ON n.awardCategory.id=a.id WHERE a.name = ?1 AND n.awardCategory.year = ?2")
    List<Movie> findAllMoviesByAwardNameAndYear(String awardName, int awardYear);

    @Query("SELECT n FROM Nominated n WHERE n.id = ?1")
    List<Nominated> findNominationById(int id);

    @Query("SELECT n FROM Nominated n JOIN n.awardCategory a WHERE a.name = ?1")
    List<Nominated> findNominationByAwardName(String awardName);

    @Query("SELECT n FROM Nominated n JOIN n.awardCategory a WHERE a.year = ?1")
    List<Nominated> findNominationByAwardYear(int awardYear);

    @Query("SELECT n FROM Nominated n JOIN n.awardCategory a WHERE a.name = ?1 AND a.year = ?2")
    List<Nominated> findNominationByAwardNameAndYear(String awardName, int awardYear);

    @Query("SELECT n FROM Nominated n JOIN n.awardCategory a WHERE a.name = ?1 AND a.year = ?2 AND n.is_winning = ?3")
    List<Nominated> findNominationByAwardNameYearAndWinning(String awardName, int awardYear, Boolean winnig);

    @Query("SELECT n FROM Nominated n JOIN n.movie m WHERE m.name = ?1 AND m.year = ?2")
    List<Nominated> findNominationByMovieNameAndYear(String movieName, int movieYear);

    @Query("SELECT n FROM Nominated n JOIN n.movie m WHERE m.name = ?1")
    List<Nominated> findNominationByMovieName(String movieName);

    @Query("SELECT n FROM Nominated n JOIN n.movie m WHERE m.year = ?1")
    List<Nominated> findNominationByMovieYear(int movieYear);

    @Query("SELECT n FROM Nominated n WHERE n.is_winning = ?1")
    List<Nominated> findNominationByWinning(Boolean winning);

    @Query("SELECT n FROM Nominated n JOIN n.person p WHERE p.firstName = ?1 AND p.lastName = ?2")
    List<Nominated> findNominationByPersonFnameAndLname(String fname, String lname);

    @Query("SELECT n FROM Nominated n JOIN n.person p WHERE p.firstName = ?1")
    List<Nominated> findNominationByPersonFname(String fname);

    @Query("SELECT n FROM Nominated n JOIN n.person p WHERE p.lastName = ?1")
    List<Nominated> findNominationByPersonLname(String lname);
}
