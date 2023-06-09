package com.example.slaughterhouse.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private float weight;
    private String origin;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Parts> parts;

    public Animal() {

    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return Objects.equals(id, animal.id) &&
                Objects.equals(date, animal.date) &&
                Objects.equals(weight, animal.weight)&&
                Objects.equals(origin, animal.origin);
    }

    public Animal(LocalDate date, float weight, String origin){
        this.date = date;
        this.weight = weight;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", date=" + date +
                ", weight=" + weight +
                ", origin='" + origin + '\'' +
                '}';
    }

    public long getId(){
        return id;
    }

    public void setDate(LocalDate date){
        this.date = date;
    }

    public LocalDate getDate(){
        return date;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return weight;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public String getOrigin(){
        return origin;
    }


    public void setId(long id) {
        this.id = id;
    }

    public List<Parts> getParts() {
        return parts;
    }

    public void setParts(List<Parts> parts) {
        this.parts = parts;
    }
}
