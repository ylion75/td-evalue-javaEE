package com.example.tdcarrental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class PersonService {
    PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    @GetMapping(value="/persons")
    @ResponseStatus(HttpStatus.OK)
    public Iterable<Person> persons(){
        return personRepository.findAll();
    }

    @GetMapping(value="/persons/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Person> getPerson(@PathVariable(value="id") long id){
        return personRepository.findById(id);
    }

    @PostMapping(value="/persons")
    @ResponseStatus(HttpStatus.OK)
    public void createPerson(@RequestBody Person newPerson){
        if(newPerson == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        personRepository.save(newPerson);
    }

    @DeleteMapping(value="/persons/{id}")
    public void deletePerson(@PathVariable(value="id") long id){
        Person person = personRepository.findById(id).get();
        personRepository.delete(person);
    }

}
