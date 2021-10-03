package ru.gb.catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ProductCatalogueApp {

    public static void main(String[] args) {

        SpringApplication.run(ProductCatalogueApp.class, args);
    }

}
