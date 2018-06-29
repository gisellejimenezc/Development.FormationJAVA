package com.company.com.m2i.poe.Train;

public class TrainGoods extends Train {

    int capacity;
    int capacitySold;
    double prixTon;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrixTon() {
        return prixTon;
    }

    public void setPrixTon(double prixTon) {
        this.prixTon = prixTon;
    }

    public int getCapacitySold() {
        return capacitySold;
    }

    public void setCapacitySold(int capacitySold) {
        this.capacitySold = capacitySold;
    }

    public double getBenefit() {
        double benefitM = capacitySold*prixTon;
        return benefitM;
    }
}
