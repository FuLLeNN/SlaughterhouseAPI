package com.example.slaughterhouse.Models;

import jakarta.persistence.*;

@Entity
public class Parts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String partType;
    private Long reference;

    public Parts(){

    }

    public Parts(String partType, Long reference){
        this.partType = partType;
        this.reference = reference;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
