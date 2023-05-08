package com.example.slaughterhouse;

import com.example.slaughterhouse.Services.Product.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class SlaughterhouseApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        SpringApplication.run(SlaughterhouseApplication.class, args);
    }

}
