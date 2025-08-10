package com.example.pets.service;

import com.example.pets.api.dto.PetDto;
import com.example.pets.api.mapper.PetMapper;
import com.example.pets.domain.Pet;
import com.example.pets.repo.PetRepository;
import org.springframework.stereotype.Service;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

@Service
public class PetService {

    private final PetRepository repo;

    public PetService(PetRepository repo) { this.repo = repo; }

    public PetDto create(PetDto dto){
        Pet p = new Pet();
        PetMapper.updateEntity(p, dto);
        return PetMapper.toDto(repo.save(p));
    }

    public List<PetDto> list(){ return repo.findAll().stream().map(PetMapper::toDto).toList(); }

    public PetDto get(Long id){
        return repo.findById(id).map(PetMapper::toDto).orElseThrow(() -> new RuntimeException("Pet not found"));
    }

    public PetDto update(Long id, PetDto dto){
        Pet p = repo.findById(id).orElseThrow(() -> new RuntimeException("Pet not found"));
        PetMapper.updateEntity(p, dto);
        return PetMapper.toDto(repo.save(p));
    }

    public void delete(Long id){ repo.deleteById(id); }

    public List<PetDto> searchBySpecies(String species){
        return repo.findBySpeciesIgnoreCase(species).stream().map(PetMapper::toDto).toList();
    }

    public Map<String, Object> stats(){
        List<Pet> pets = repo.findAll();
        IntSummaryStatistics s = pets.stream()
                .filter(p -> p.getAgeYears()!=null)
                .mapToInt(Pet::getAgeYears)
                .summaryStatistics();
        return Map.of(
                "totalPets", pets.size(),
                "avgAgeYears", s.getCount()==0 ? null : s.getAverage()
        );
    }
}
