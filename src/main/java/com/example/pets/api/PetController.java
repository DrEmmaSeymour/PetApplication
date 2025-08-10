package com.example.pets.api;

import com.example.pets.api.dto.PetDto;
import com.example.pets.service.PetService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/pets")
public class PetController {

    private final PetService service;

    public PetController(PetService service) { this.service = service; }

    @PostMapping
    public ResponseEntity<PetDto> create(@RequestBody PetDto dto){ return ResponseEntity.ok(service.create(dto)); }

    @GetMapping
    public List<PetDto> list(){ return service.list(); }

    @GetMapping("/{id}")
    public PetDto get(@PathVariable Long id){ return service.get(id); }

    @PutMapping("/{id}")
    public PetDto update(@PathVariable Long id, @RequestBody PetDto dto){ return service.update(id, dto); }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){ service.delete(id); return ResponseEntity.noContent().build(); }

    @GetMapping("/search")
    public List<PetDto> search(@RequestParam String species){ return service.searchBySpecies(species); }

    @GetMapping("/stats")
    public Map<String, Object> stats(){ return service.stats(); }
}
