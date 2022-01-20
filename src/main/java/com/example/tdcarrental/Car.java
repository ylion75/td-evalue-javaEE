package com.example.tdcarrental;

public class Car extends Vehicule{
    private int numberOfSeats;

    public Car(){
        super();
    }

    public Car(String plateNumber, String marque, int numberOfSeats){
        super(plateNumber,marque);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "La voiture à :" + numberOfSeats;
    }
}
