package com.example.slaughterhouse.Services.Animal;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface AnimalService {
    Optional<Animal> findAnimalById(Long id);
    List<Animal> findAnimalsByOrigin(String origin);
    List<Animal> findAnimalsByDate(LocalDate date);
    List<Parts> findPartsByAnimal(Long id);
    Animal saveAnimal(Animal animal);
    Animal updateAnimal(Animal animal);
    void deleteAnimalById(Long id);
    List<Animal> getAll();
    Animal addPart(Long id, Parts part);
}
