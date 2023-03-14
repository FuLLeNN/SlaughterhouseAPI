package com.example.slaughterhouse.Services.Parts;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Repositories.AnimalRepository;
import com.example.slaughterhouse.Repositories.PartsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsServiceImpl implements PartsService{

    private final PartsRepository partsRepository;
    private final AnimalRepository animalRepository;

    public PartsServiceImpl(PartsRepository partsRepository, AnimalRepository animalRepository) {
        this.partsRepository = partsRepository;
        this.animalRepository = animalRepository;
    }

    @Override
    public Optional<Parts> findById(Long id) {
        return partsRepository.findById(id);
    }

    @Override
    public Animal findAnimalByPartId(Long id) {
        Parts part = findById(id).get();
        return animalRepository.findById(part.getReference()).get();
    }

    @Override
    public List<Parts> findPartsByPartType(String partType) {
        return partsRepository.findByPartType(partType);
    }

    @Override
    public Parts savePart(Parts part) {
        Animal a = animalRepository.findById(part.getReference()).get();
        return partsRepository.save(part);
    }

    @Override
    public Parts updatePart(Parts part) {
        Parts p = findById(part.getId()).get();
        p.setPartType(part.getPartType());
        p.setReference(part.getReference());
        return partsRepository.save(p);
    }

    @Override
    public void deletePartById(Long id) {
        partsRepository.deleteById(id);
    }

}
