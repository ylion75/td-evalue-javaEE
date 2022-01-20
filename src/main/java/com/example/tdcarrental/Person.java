package com.example.tdcarrental;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {
    private long id;
    private String name;
    private List<Rent> rents = new ArrayList<Rent>();

    public Person() {
        super();
    }

    public Person(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    @OneToMany(mappedBy = "person")
    public List<Rent> getRents(){
        return rents;
    }

    public void setRents(List<Rent> rents){
        this.rents = rents;
    }
    public void addRent(Rent rent){
        this.getRents().add(rent);
        rent.setPerson(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
