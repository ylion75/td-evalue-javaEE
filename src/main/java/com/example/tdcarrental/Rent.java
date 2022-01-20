package com.example.tdcarrental;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Rent {
    private int id;
    private Date beginDate;
    private Date endDate;
    private Person person;
    private Vehicule vehicule;

    public Rent(){
        super();
    }

    public Rent(Date beginDate, Date endDate, Vehicule vehicule, Person person){
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.vehicule = vehicule;
        this.person = person;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @ManyToOne
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
