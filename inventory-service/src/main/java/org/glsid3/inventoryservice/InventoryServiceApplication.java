package org.glsid3.inventoryservice;

import org.glsid3.inventoryservice.dao.ProductRepository;
import org.glsid3.inventoryservice.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return  args -> {
            productRepository.save(new Product(null,"Computer Desktop HP",900));
            productRepository.save(new Product(null,"Printer Epson",90));
            productRepository.save(new Product(null,"MacBook Pro LapTop",1800));
            productRepository.findAll().forEach( System.out::println);

        };
    }

}
