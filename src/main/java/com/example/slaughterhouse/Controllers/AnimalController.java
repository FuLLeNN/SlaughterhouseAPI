package com.example.slaughterhouse.Controllers;

import com.example.slaughterhouse.DTOs.CreateAnimalDTO;
import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Services.Animal.AnimalService;
import com.example.slaughterhouse.Services.Animal.AnimalServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Tag(description = "",name = "Animals Resource")
@RestController
@RequestMapping("api/animals")
public class AnimalController {

    private final AnimalService animalService;

    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @Operation(summary  = "Get an animal by id", description = "Returns an animal as per the id")
    @GetMapping("/{id}")
    public Optional<Animal> getAnimalById(@PathVariable("id") Long id){
        return animalService.findAnimalById(id);
    }

    @Operation(summary  = "Get all animals", description = "Returns all animals")
    @GetMapping("/")
    public List<Animal> getAllAnimals(){
        return animalService.getAll();
    }

    @Operation(summary = "Create animal", description = "Create an animal")
    @PostMapping("/")
    public Animal createAnimal(@RequestBody CreateAnimalDTO animal){
        Animal a = new Animal();
        a.setDate(animal.getDate());
        a.setWeight(animal.getWeight());
        a.setOrigin(animal.getOrigin());
        return animalService.saveAnimal(a);
    }

    @Operation(summary = "Find animals by origin", description = "Find all animals from certain origin")
    @GetMapping("/origin/{origin}")
    public List<Animal> findByOrigin(@PathVariable("origin") String origin){
        return animalService.findAnimalsByOrigin(origin);
    }

    @Operation(summary = "Find animals by arrival date", description = "Find animals that arrived at a certain date")
    @GetMapping("/date/{date}")
    public List<Animal> findByDate(@PathVariable("date")LocalDate date){
        return animalService.findAnimalsByDate(date);
    }

    @Operation(summary = "Update animal by id", description = "Make changes on an animal by the id")
    @PutMapping("/{id}")
    public Animal updateAnimal(@PathVariable("id") Long id, @RequestBody CreateAnimalDTO animal ){
        Animal a = animalService.findAnimalById(id).get();
        a.setDate(animal.getDate());
        a.setWeight(animal.getWeight());
        a.setOrigin(animal.getOrigin());
        return animalService.updateAnimal(a);
    }

    @Operation(summary = "Delete animal by id", description = "Delete an animal by its id")
    @DeleteMapping("/{id}")
    public void deleteAnimal(@PathVariable("id") Long id){
        animalService.deleteAnimalById(id);
    }

    @Operation(summary = "Find parts of animal by id", description = "Find parts of a specific animal by its id")
    @GetMapping("/parts/{id}")
    public List<Parts> getPartsByAnimal(@PathVariable("id") Long id){
        return animalService.findPartsByAnimal(id);
    }
}
