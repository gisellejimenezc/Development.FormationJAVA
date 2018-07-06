package com.company.Media;

import java.util.List;

public interface IMedia {
    //@Override
    double getPrice();

    // @Override
    void setPrice(double price);

    //@Override
    int getId();

    // @Override
    void setId(int id);

    //@Override
    String getTitle();

    // @Override
    void setTitle(String title);

    //@Override
    Publisher getPublisher();

    // @Override
    void setPublisher(Publisher publisher);

    //@Override
    List<Author> getAuthorList();

    //@Override
    void setAuthorList(List<Author> authorList);

    double getNetPrice();
}
