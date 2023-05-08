package com.example.slaughterhouse.Services.Parts;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PartsService {
    Optional<Parts> findById(Long id);
    Animal findAnimalByPartId(Long id);
    List<Parts> findPartsByPartType(String partType);
    Parts savePart(Parts part);
    Parts updatePart(Parts part);
    void deletePartById(Long id);
}
