package com.example.tdcarrental;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Vehicule {
    private String plateNumber;
    private String marque;
    private List<Rent> rents = new ArrayList<Rent>();

    public Vehicule(){
        super();
    }

    public Vehicule(String plateNumber, String marque){
        this.plateNumber = plateNumber;
        this.marque = marque;
    }

    public String findByPlate(String plate){
        if(plate.equals(this.plateNumber)){
            return this.plateNumber;
        }
        else return null;
    }

    @OneToMany(mappedBy="vehicule")
    public List<Rent> getRents() {
        return rents;
    }

    public void setRents(List<Rent> rents) {
        this.rents = rents;
    }

    @Id
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
