package com.example.slaughterhouse.Repositories;

import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    Product findByParts(Parts part);
}
