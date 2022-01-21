package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @GetMapping(value="/vehicules/{plateNumber}")
    public Optional<Vehicule> getVehicule(@PathVariable(value="plateNumber") String platenumber){
        return vehiculeRepository.findById(platenumber);
    }

    @PostMapping(value="/vehicules")
    public void createVehicule(@RequestBody Vehicule vehicule){
        if(vehicule == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        vehiculeRepository.save(vehicule);
    }

    @DeleteMapping(value="/vehicules/{plateNumber}")
    public void deleteVehicule(@PathVariable(value="id") String plateNumber){
        Vehicule vehicule = vehiculeRepository.findById(plateNumber).get();
        vehiculeRepository.delete(vehicule);
    }


}
