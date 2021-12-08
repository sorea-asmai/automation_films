package com.backend.automationfilms;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity  // Makes a table for this class
@Table(name = "movie")
public class Movie {

    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // Movie name
    private String name;
    
    // Movie description
    private String description;

    // Movie year
    private Integer year;

    // Movie poster
    private String poster;

    private String imbdLink;

    // Many to many relationship as multiple movies can fit into many different genres
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "movie_genre",
        joinColumns = {
            @JoinColumn(name = "movie_id", referencedColumnName = "id",
                nullable = false, updatable = false)},
        inverseJoinColumns = {
            @JoinColumn(name = "genre_id", referencedColumnName = "id",
                nullable = false, updatable = false)})
    @JsonManagedReference
    private Set<Genre> genre = new HashSet<>();

    @OneToMany(mappedBy = "movie")
    @JsonBackReference
    Set<Nominated> nomination;

    // Basic setter and getter methods
    // Can be changed or deleted based on need
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getImbdLink() {
        return imbdLink;
    }

    public void setImbdLink(String imbdString) {
        this.imbdLink = imbdString;
    }

    public Set<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Set<Genre> genre) {
        this.genre = genre;
    }

    public String toString() {
        String result = "";
        result = result + getId() + "\n";
        result = result + getName() + "\n";
        result = result + getYear() + "\n";
        result = result + getDescription() + "\n";
        result = result + getPoster() + "\n";
        result = result + getImbdLink() + "\n";
        for(Genre g : getGenre()) {
            result = result + g;
        }
        result = result + "\n";
        return result;
    }
 }
