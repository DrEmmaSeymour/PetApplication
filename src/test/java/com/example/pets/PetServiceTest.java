package com.example.pets;

import com.example.pets.api.dto.PetDto;
import com.example.pets.service.PetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PetServiceTest {

    @Autowired
    private PetService service;

    @Test
    void createsAndListsPets() {
        PetDto created = service.create(new PetDto(null,"Luna","cat","Siamese",2, LocalDate.now()));
        assertThat(created.id()).isNotNull();

        assertThat(service.list()).extracting(PetDto::name).contains("Luna");
    }
}
