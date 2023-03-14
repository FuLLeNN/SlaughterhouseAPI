package com.example.slaughterhouse.Services.Animal;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Repositories.AnimalRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalServiceImpl implements AnimalService{

    private final AnimalRepository animalRepository;

    public AnimalServiceImpl(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Animal> findAnimalById(Long id) {
        return animalRepository.findById(id);
    }

    @Override
    public List<Animal> findAnimalsByOrigin(String origin) {
        return animalRepository.findByOrigin(origin);
    }

    @Override
    public List<Animal> findAnimalsByDate(LocalDate date) {
        return animalRepository.findByDate(date);
    }

    @Override
    public List<Parts> findPartsByAnimal(Long id) {
        return animalRepository.findById(id).get().getParts();
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public void deleteAnimalById(Long id) {
        animalRepository.deleteById(id);
    }

    @Override
    public List<Animal> getAll() {
        return animalRepository.findAll();
    }

    @Override
    public Animal addPart(Long id, Parts part) {
        Animal a = animalRepository.findById(id).get();
        a.getParts().add(part);
        return animalRepository.save(a);
    }
}
