package com.company.com.m2i.poe.Train;

public class TrainPassengers extends Train{

    private double prix;
    private int nbPlaces;
    private int nbPassangers;

    public TrainPassengers() {
    }

    public TrainPassengers(int id, String origin, String destination, double time, double duration) {
        super(id, origin, destination, time, duration);
    }

    public double getPrixFC() {
        return prix;
    }

    public void setPrixFC(double prixFC) {
        this.prix = prixFC;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }

    public int getNbPassangers() {
        return nbPassangers;
    }

    public void setNbPassangers(int nbPassangers) {
        this.nbPassangers = nbPassangers;
    }

    public int getnbFree(){
        int nbFree= nbPlaces - nbPassangers;
        return nbFree;
    }

    public double getBenefit(){
        double benefit = nbPassangers*prix;
        return benefit;
    }
}
