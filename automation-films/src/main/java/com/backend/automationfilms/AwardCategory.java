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

@Entity  // makes a table out of this class
@Table(name = "awardCategory") // names the table
public class AwardCategory {

    // Generates id for table
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    // Award catagory name
    private String name;

    // Year of the award
    private Integer year; 

    @OneToMany(mappedBy = "awardCategory")
    @JsonBackReference
    Set<Nominated> nomination;

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

    public Set<Nominated> getNomination() {
        return nomination;
    }

    public String toString() {
        String result = "";
        result = result + getId() + "\n";
        result = result + getName() + "\n";
        result = result + getYear() + "\n";
        return result;
    }
}
