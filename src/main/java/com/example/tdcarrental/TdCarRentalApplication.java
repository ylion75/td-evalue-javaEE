package com.example.tdcarrental;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TdCarRentalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TdCarRentalApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(){
        return (args) -> {
            System.out.println("Démarrage du programme");
        };
    }

}
