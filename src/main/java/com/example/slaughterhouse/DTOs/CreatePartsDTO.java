package com.example.slaughterhouse.DTOs;

import com.example.slaughterhouse.Models.Animal;
import jakarta.persistence.ManyToOne;

public class CreatePartsDTO {
    private String partType;
    private Long reference;

    public String getPartType() {
        return partType;
    }

    public void setPartType(String partType) {
        this.partType = partType;
    }

    public Long getReference() {
        return reference;
    }

    public void setReference(Long reference) {
        this.reference = reference;
    }
}
