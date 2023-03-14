package com.example.slaughterhouse.Models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private float weight;
    private String origin;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Parts> parts;

    public Animal() {

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
