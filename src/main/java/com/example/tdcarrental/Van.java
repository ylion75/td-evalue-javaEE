package com.example.tdcarrental;

public class Van extends Vehicule{
    private int maxWeight;
    public Van(){
        super();
    }

    public Van(String plate, String marque, int maxWeight){
        super(plate, marque);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "Le poids maximum est :" + maxWeight;
    }
}
