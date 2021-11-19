package com.backend.automationfilms;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
    private String poster; // dont know yet

    private String imbdLink; // ?? not sure what this is for (Was in dbDiagram)

    // Many to one relationship as one actor can star in many movies
    @ManyToOne
    @JoinColumn(name = "actor_id", nullable = false)
    private Actor actor;

    // Many to one relationship as one director can direct multipule movies
    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    private Director director;

    // Many to many relationship as multiple movies can fit into many different genres
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "movie_genre",
        joinColumns = {
            @JoinColumn(name = "movie_id", referencedColumnName = "id",
                nullable = false, updatable = false)},
        inverseJoinColumns = {
            @JoinColumn(name = "genre_id", referencedColumnName = "id",
                nullable = false, updatable = false)})
    private Set<Genre> genre = new HashSet<>();

    // Many to many relationship as multiple movies can be nominated for many
    // different award catagories
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "movie_award",
        joinColumns = {
            @JoinColumn(name = "movie_id", referencedColumnName = "id",
                nullable = false, updatable = false)},
        inverseJoinColumns = {
            @JoinColumn(name = "award_id", referencedColumnName = "id",
                nullable = false, updatable = false)})
    private Set<Award> award = new HashSet<>();

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

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Genre> getGenre() {
        return genre;
    }

    public void setGenre(Set<Genre> genre) {
        this.genre = genre;
    }

    public Set<Award> getAward() {
        return award;
    }

    public void setAward(Set<Award> award) {
        this.award = award;
    }
 }
