package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class VehiculeService {
    VehiculeRepository vehiculeRepository;

    @Autowired
    public VehiculeService(VehiculeRepository vehiculeRepository){
        this.vehiculeRepository = vehiculeRepository;
    }

    @GetMapping(value="/vehicules")
    public Iterable<Vehicule> vehicules(){
        return vehiculeRepository.findAll();
    }

    @GetMapping(value="/vehicules/{platenumber}")
    public Optional<Vehicule> getVehicule(@PathVariable(value="platenumber") String platenumber){
        return vehiculeRepository.findById(platenumber);
    }


}
