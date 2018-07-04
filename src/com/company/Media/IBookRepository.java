package com.company.Media;

import java.io.IOException;
import java.util.List;

public interface IBookRepository {

    List<Book> getAll() throws IOException;
    Book getById(int id);
    List<Book> getByTitle(String title);
    List<Book> getByPrice(double price);
    List<Book> getByPublisher(String publisherName);

    /*void load(String uri);

    List<Book> getAll();
    Book getById(int id);
    List<Book> getByTitle(String title);
    List<Book> getByPrice(double price);
    List<Book> getByPublisher(String publisherName); // Bonus
    // Bonus
    void add(Book b);
    void remove(Book b);
    void update(Book b);*/

}
