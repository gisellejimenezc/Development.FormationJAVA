package com.company.Media;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IBookRepository {

    List<Book> getAll() throws IOException, SQLException;
    Book getById(int id) throws SQLException;
    List<Book> getByTitle(String title) throws SQLException;
    List<Book> getByPrice(double price) throws SQLException;
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
