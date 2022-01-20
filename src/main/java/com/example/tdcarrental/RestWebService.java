package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class RestWebService {
    RentRepository rentRepository;

    @Autowired
    public RestWebService(RentRepository rentRepository){
        super();
        this.rentRepository = rentRepository;
    }

    @GetMapping("/rentals")
    public Iterable<Rent> getRentals(){
        return rentRepository.findAll();
    }

    @PostMapping("/rentals")
    public void addRent(@RequestBody Rent rent){
        rentRepository.save(rent);
    }
}
