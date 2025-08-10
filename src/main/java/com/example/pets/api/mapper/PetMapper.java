package com.example.pets.api.mapper;

import com.example.pets.api.dto.PetDto;
import com.example.pets.domain.Pet;

public class PetMapper {
    public static PetDto toDto(Pet p){
        return new PetDto(p.getId(), p.getName(), p.getSpecies(), p.getBreed(), p.getAgeYears(), p.getAdoptedOn());
    }
    public static void updateEntity(Pet p, PetDto d){
        p.setName(d.name());
        p.setSpecies(d.species());
        p.setBreed(d.breed());
        p.setAgeYears(d.ageYears());
        p.setAdoptedOn(d.adoptedOn());
    }
}
