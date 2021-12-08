package com.backend.automationfilms;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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

    private String role;

    @OneToMany(mappedBy = "person")
    @JsonBackReference
    Set<Nominated> nomination;

    // Getter and setter methods
    // Can be changed or deleted based on need

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String toString() {
        String result = "";
        result = result + getId() + "\n";
        result = result + getFirstName() + "\n";
        result = result + getLastName() + "\n";
        result = result + getRole() + "\n";
        return result;
    }
}
