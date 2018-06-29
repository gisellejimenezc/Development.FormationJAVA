package com.company.Media;

import java.util.ArrayList;

public class Media {

    private String id;
    private String titre;
    private double price;
    private Publisher publisher;
    private ArrayList<Author> authorList = new ArrayList<>();

    public Media (){
    }

    public Media(String id, String titre, double price) {
        this.id = id;
        this.titre = titre;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public double getPrice() {
        return price;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList = authorList;
    }

    public double getNetPrice(){                        //public double getNetPrice(){
        double netPrice = this.price*1.2;               //return price*1.2;
        System.out.println("netPrice = "+netPrice);     //}
        return netPrice;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id='" + id + '\'' +
                ", titre='" + titre + '\'' +
                ", price=" + price +
                ", authorList=" + authorList +
                '}';
    }
}
