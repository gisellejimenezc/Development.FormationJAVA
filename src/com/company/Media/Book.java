package com.company.Media;

public class Book extends Media{

    public Book(String id, String titre, double price, int nbpage) {
        super(id, titre, price);
    }

    @Override
    public double getNetPrice(){
        double netPrice = getPrice()*1.05;
        System.out.println("netPrice = "+ netPrice);
        return netPrice;
    }

    @Override
    public String toString() {
        return "Book{} " + super.toString();
    }


}
