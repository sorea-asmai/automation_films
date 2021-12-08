package com.backend.automationfilms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Nominated {
    
    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "awardCategory_id")
    @JsonManagedReference
    private AwardCategory awardCategory;

    @ManyToOne
    @JoinColumn(name = "movie_id")
    @JsonManagedReference
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = true)
    @JsonManagedReference
    private Person person;

    boolean is_winning;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AwardCategory getAwardCategory() {
        return awardCategory;
    }

    public void setAwardCategory(AwardCategory awardCategory) {
        this.awardCategory = awardCategory;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Boolean getIs_winning() {
        return is_winning;
    }

    public void setIs_winning(Boolean is_winning) {
        this.is_winning = is_winning;
    }

    public String toString() {
        String result = "";
        result = result + getId() + "\n";
        result = result + getMovie() + "\n";
        result = result + getAwardCategory() + "\n";
        result = result + getPerson() + "\n";
        result = result + getIs_winning() + "\n";
        return result;
    }
}
