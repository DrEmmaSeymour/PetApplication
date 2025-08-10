// src/main/java/com/example/pets/PetApiApplication.java
package com.example.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.pets.domain")
@EnableJpaRepositories(basePackages = "com.example.pets.repo")
public class PetApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PetApiApplication.class, args);
    }
}
