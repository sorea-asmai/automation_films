package com.backend.automationfilms;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity  // makes a table out of this class
@Table(name = "award") // names the table
public class Award {

    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // Award catagory name
    private String name;

    // Year of the award
    private Integer year; 

    // Many to many relationship as multiple movies/actors/directors can
    // be nominated in multiple award catagories
    @ManyToMany(mappedBy = "award")
    private Set<Movie> movie = new HashSet<>();

    @ManyToMany(mappedBy = "award")
    private Set<Actor> actor = new HashSet<>();

    @ManyToMany(mappedBy = "award")
    private Set<Director> director = new HashSet<>();

    // Getter and setter methods
    // Can be changed or deleted depending on need
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }

    public Set<Actor> getActor() {
        return actor;
    }

    public void setActor(Set<Actor> actor) {
        this.actor = actor;
    }

    public Set<Director> getDirector() {
        return director;
    }

    public void setDirector(Set<Director> director) {
        this.director = director;
    }
}
