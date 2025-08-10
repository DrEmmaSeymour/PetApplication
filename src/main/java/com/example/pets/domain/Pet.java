package com.example.pets.domain;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "pet")
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="species", nullable = false)
    private String species;

    @Column(name="breed")
    private String breed;

    @Column(name="age_years")
    private Integer ageYears;

    @Column(name="adopted_on")
    private LocalDate adoptedOn;

    public Pet() {
    }

    public Pet(String name, String species, String breed, Integer ageYears, LocalDate adoptedOn) {
        this.name = name;
        this.species = species;
        this.breed = breed;
        this.ageYears = ageYears;
        this.adoptedOn = adoptedOn;
    }

    // ----- Getters & Setters -----

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Integer getAgeYears() {
        return ageYears;
    }

    public void setAgeYears(Integer ageYears) {
        this.ageYears = ageYears;
    }

    public LocalDate getAdoptedOn() {
        return adoptedOn;
    }

    public void setAdoptedOn(LocalDate adoptedOn) {
        this.adoptedOn = adoptedOn;
    }

    // ----- equals & hashCode -----

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ----- toString -----
    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", breed='" + breed + '\'' +
                ", ageYears=" + ageYears +
                ", adoptedOn=" + adoptedOn +
                '}';
    }
}
