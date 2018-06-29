package com.company.Media;

public class CD extends Media{

    public CD(String id, String titre, double price, int nbtrack) {
        super(id, titre, price);
    }


    @Override
    public String toString() {
        return "CD{} " + super.toString();
    }
}
