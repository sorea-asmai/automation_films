package com.backend.automationfilms;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity  // Makes a table for this class
@Table(name = "genre")  // Names the table
public class Genre {

    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // Genre name
    private String name;

    // Many to many relationship as multiple movies can fit in multiple genres
    @ManyToMany(mappedBy = "genre")
    @JsonBackReference
    private Set<Movie> movie = new HashSet<>();

    // Getter and Setter methods
    // Can be deleted or changed based on need
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

    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }

    public String toString() {
        String result = "";
        result = result + getId() + "\n";
        result = result + getName() + "\n";
        return result;
    }
}
