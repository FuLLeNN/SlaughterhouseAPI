package com.example.slaughterhouse.DTOs;

import java.time.LocalDate;

public class CreateAnimalDTO {
    private LocalDate date;
    private float weight;
    private String origin;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
