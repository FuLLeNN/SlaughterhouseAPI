package com.example.slaughterhouse.Repositories;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartsRepository extends JpaRepository<Parts, Long> {
    List<Parts> findByPartType(String partType);
    Animal findAnimalByReference(Animal animal);

}
