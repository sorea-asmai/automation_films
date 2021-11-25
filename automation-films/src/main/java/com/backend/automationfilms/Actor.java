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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity  // This tells Hibernate to make a table out of this class
@Table(name = "actor")  // Names the table
public class Actor {

    //Generates id for database table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")  // Names the column
    private Integer id;

    // One to one relationship with person table
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    // One to many relationship with movie table as one actor can star in
    // multiple movies
    @OneToMany(mappedBy = "actor")
    private Set<Movie> movie = new HashSet<>();

    // Many to many relationship as multiple actors can be nominated
    // for multiple awards throughout the years
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "actor_award",
        joinColumns = {
            @JoinColumn(name = "actor_id", referencedColumnName = "id",
                nullable = false, updatable = false)},
        inverseJoinColumns = {
            @JoinColumn(name = "award_id", referencedColumnName = "id",
                nullable = false, updatable = false)})
    private Set<Award> award = new HashSet<>();

    // Basic Getter and setter methods
    // Can be changed or deleted depending on need
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Set<Movie> getMovie() {
        return movie;
    }

    public void setMovie(Set<Movie> movie) {
        this.movie = movie;
    }

    public Set<Award> getAward() {
        return award;
    }

    public void setAward(Set<Award> award) {
        this.award = award;
    }
}
