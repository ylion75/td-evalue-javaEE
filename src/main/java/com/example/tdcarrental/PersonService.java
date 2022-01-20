package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class PersonService {
    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping(value="/persons")
    public Iterable<Person> persons(){
        return personRepository.findAll();
    }

    @GetMapping(value="/persons/{id}")
    public Optional<Person> getPerson(@PathVariable(value="id") long id){
        return personRepository.findById(id);
    }


}
