package com.backend.automationfilms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

@Entity  // Makes a table for this class
@Table(name = "person")  // Names the table
public class Person {

    // Generates id for talbe
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // Person's name
    private String firstName;

    // Person's lastname
    private String lastName;

    // Person's date of birth
    private Date dateBirth;  // Not sure we need this?

    // Person's date of death if applicable
    private Date dateDeath;   // Not sure we need this?

    // One to one relationship with actor
    @OneToOne(mappedBy = "person")
    private Actor actor;

    // One to one relationship with director
    @OneToOne(mappedBy = "person")
    private Director director;

    // Getter and setter methods
    // Can be changed or deleted based on need
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public Date getDateDeath() {
        return dateDeath;
    }

    public void setDateDeath(Date dateDeath) {
        this.dateDeath = dateDeath;
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
}
