package com.example.slaughterhouse.Controllers;

import com.example.slaughterhouse.DTOs.CreatePartsDTO;
import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Services.Animal.AnimalServiceImpl;
import com.example.slaughterhouse.Services.Parts.PartsServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Tag(description = "",name = "Parts Resource")
@RestController
@RequestMapping("api/parts")
public class PartsController {

    private final PartsServiceImpl partsService;
    private final AnimalServiceImpl animalService;

    public PartsController(PartsServiceImpl partsService, AnimalServiceImpl animalService) {
        this.partsService = partsService;
        this.animalService = animalService;
    }

    @Operation(summary  = "Get a part by id", description = "Returns a Part by id")
    @GetMapping("/{id}")
    public Optional<Parts> getPartById(@PathVariable("id") Long id){
        return partsService.findById(id);
    }

    @Operation(summary = "Create part", description = "Create part with animal reference")
    @PostMapping("/create")
    public Animal createPart(@RequestBody CreatePartsDTO parts){
        Parts part = new Parts();
        part.setPartType(parts.getPartType());
        part.setReference(parts.getReference());
        return animalService.addPart(parts.getReference(), partsService.savePart(part));
    }

    @Operation(summary  = "Get an animal by the part id", description = "Returns a Part by id")
    @GetMapping("/findAnimal/{id}")
    public Animal findAnimalByPartId(@PathVariable("id") Long id){
        return partsService.findAnimalByPartId(id);
    }
}
