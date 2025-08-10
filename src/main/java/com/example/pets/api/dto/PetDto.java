package com.example.pets.api.dto;

import java.time.LocalDate;

public record PetDto(
        Long id,
        String name,
        String species,
        String breed,
        Integer ageYears,
        LocalDate adoptedOn
) {}
