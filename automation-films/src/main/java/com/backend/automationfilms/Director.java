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
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity // Makes a table out of this class
@Table(name = "director") // names the table
public class Director {

    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // One to one relationship with person
    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    // One to many relationship as one director can direct multiple movies
    @OneToMany(mappedBy = "director")
    private Set<Movie> movie = new HashSet<>();

    // Many to many relationship as multiple directors can be nominated for 
    // multiple awards throughout the years
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(name = "director_award",
        joinColumns = {
            @JoinColumn(name = "director_id", referencedColumnName = "id",
                nullable = false, updatable = false)},
        inverseJoinColumns = {
            @JoinColumn(name = "award_id", referencedColumnName = "id",
                nullable = false, updatable = false)})
    private Set<Award> award = new HashSet<>();

    // Getter and setter methods
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
