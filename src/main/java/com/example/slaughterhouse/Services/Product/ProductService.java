package com.example.slaughterhouse.Services.Product;

import com.example.protobuf.*;
import com.example.slaughterhouse.Models.Animal;
import com.example.slaughterhouse.Models.Parts;
import com.example.slaughterhouse.Models.Product;
import com.example.slaughterhouse.Repositories.AnimalRepository;
import com.example.slaughterhouse.Repositories.PartsRepository;
import com.example.slaughterhouse.Repositories.ProductRepository;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
@GRpcService
public class ProductService extends ProductServiceGrpc.ProductServiceImplBase {

    private final PartsRepository partsRepository;
    private final ProductRepository productRepository;
    private final AnimalRepository animalRepository;

    public ProductService(PartsRepository partsRepository, ProductRepository productRepository, AnimalRepository animalRepository) {
        this.partsRepository = partsRepository;
        this.productRepository = productRepository;
        this.animalRepository = animalRepository;
    }

    @Override
    public void getAnimalsInProduct(getAnimalsInProductRequest request, StreamObserver<getAnimalsInProductResponse> responseObserver) {
        Long id = request.getId();
        Product product = productRepository.findById(id).get();
        List<Parts> parts  = product.getParts();
        List<Animal> animals = new ArrayList<>();

        for (Parts p : parts) {
            Animal animal = animalRepository.findById(p.getReference()).get();
            boolean animalAlreadyExists = false;
            for (Animal existingAnimal : animals) {
                if (existingAnimal.equals(animal)) {
                    animalAlreadyExists = true;
                    break;
                }
            }
            if (!animalAlreadyExists) {
                animals.add(animal);
            }
        }


        getAnimalsInProductResponse response = getAnimalsInProductResponse.newBuilder()
                .addAllAnimals(animals.stream()
                        .map(a -> com.example.protobuf.Animal.newBuilder()
                                .setId(a.getId())
                                .setWeight(a.getWeight())
                                .setOrigin(a.getOrigin())
                                .addAllParts(a.getParts().stream()
                                        .map(p -> com.example.protobuf.Parts.newBuilder()
                                                .setId(p.getId())
                                                .setReference(p.getReference())
                                                .setPartType(p.getPartType())
                                                .build())
                                        .collect(Collectors.toList()))
                                .setDay(a.getDate().getDayOfMonth())
                                .setMonth(a.getDate().getMonthValue())
                                .setYear(a.getDate().getYear())
                                .build())
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getProductsWithAnimal(getProductsWithAnimalRequest request, StreamObserver<getProductsWithAnimalResponse> responseObserver) {
        Long id = request.getId();
        Animal animal = animalRepository.findById(id).get();
        List<Parts> parts = animal.getParts();
        List<Product> products = new ArrayList<>();

        for (Parts p : parts){
            Product product = productRepository.findById(p.getReference()).get();
            boolean partAlreadyExists = false;
            for (Product existingProduct : products) {
                if (existingProduct.equals(product)) {
                    partAlreadyExists = true;
                    break;
                }
            }
            if (!partAlreadyExists) {
                products.add(product);
            }
        }

        getProductsWithAnimalResponse response = getProductsWithAnimalResponse.newBuilder()
                .addAllProducts(products.stream()
                        .map(p -> com.example.protobuf.Product.newBuilder()
                                .setId(p.getId())
                                .addAllParts(p.getParts().stream()
                                        .map(par-> com.example.protobuf.Parts.newBuilder()
                                                .setId(par.getId())
                                                .setReference(par.getReference())
                                                .setPartType(par.getPartType())
                                                .build())
                                        .collect(Collectors.toList()))
                                .build())
                        .collect(Collectors.toList()))
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
