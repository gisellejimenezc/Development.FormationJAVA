package com.company.Media;

import java.util.ArrayList;
import java.util.List;

public abstract class Media implements IMedia {

    private double price;
    private int id;
    private String title;
    private Publisher publisher;
    private List<Author> authorList = new ArrayList<>();

    public Media() {}

    public Media(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    //@Override
    @Override
    public double getPrice() {
        return price;
    }

   // @Override
    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    //@Override
    @Override
    public int getId() {
        return id;
    }

   // @Override
    @Override
    public void setId(int id) {
        this.id = id;
    }

    //@Override
    @Override
    public String getTitle() {
        return title;
    }

   // @Override
    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    //@Override
    @Override
    public Publisher getPublisher() {
        return publisher;
    }

   // @Override
    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    //@Override
    @Override
    public List<Author> getAuthorList() {
        return authorList;
    }

    //@Override
    @Override
    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Media{" +
                "price=" + price +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", publisher=" + publisher +
                ", authorList=" + authorList +
                '}';
    }
}
