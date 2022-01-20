package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class RentService {
    RentRepository rentRepository;

    @Autowired
    public RentService(RentRepository rentRepository){
        this.rentRepository = rentRepository;
    }

    @GetMapping(value="/rents")
    public Iterable<Rent> rents(){
        return rentRepository.findAll();
    }

    @GetMapping(value="/rents/{id}")
    public Optional<Rent> getRent(@PathVariable(value="id") int id){
        return rentRepository.findById(id);
    }


}
