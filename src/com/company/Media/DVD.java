package com.company.Media;

public class DVD extends Media {

    public DVD(String id, String titre, double price, int zone) {
        super(id, titre, price);
    }

    @Override
    public double getNetPrice(){
        double netPrice = getPrice()*1.2*0.8;
        System.out.println("netPrice = "+ netPrice);
        return netPrice;
    }

    @Override
    public String toString() {
        return "DVD{} " + super.toString();
    }
}
