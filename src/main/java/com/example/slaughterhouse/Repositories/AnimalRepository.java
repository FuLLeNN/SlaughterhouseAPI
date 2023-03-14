package com.example.slaughterhouse.Repositories;

import com.example.slaughterhouse.Models.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long>{
    List<Animal> findByOrigin(String origin);
    List<Animal> findByDate(LocalDate date);
}
