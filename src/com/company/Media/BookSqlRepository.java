package com.company.Media;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookSqlRepository extends BookRepository implements IBookRepository {

    private Connection connection;

    public void load(String uri) throws ClassNotFoundException, SQLException {
        String driverName = "org.postgresql.Driver";
        String url = uri;
        Class.forName(driverName);
        connection = DriverManager.getConnection(url, "postgres", "sorpres2");
        //Statement st = conn.createStatement();
        /*ResultSet rs = ((Statement) st).executeQuery("select * from book");
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            bookList.add(new Book(id, title, price));
        }
        conn.close();*/
    }

    @Override
    public List<Book> getAll() throws SQLException {
        Statement st = connection.createStatement();
        ResultSet rs = ((Statement) st).executeQuery("select * from book");
        List<Book> res = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book b = new Book(id, title, price);
            res.add(b);
        }
        return res;
    }

    @Override
    public Book getById(int id) throws SQLException {
        Statement st = null;
        st = connection.createStatement();
        ResultSet rs = null;
        rs = ((Statement) st).executeQuery("select * from book where id ="+id);
        Book b = new Book();
        while (rs.next()) {
            //int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            b = new Book(id, title, price);
            break;
        }
        return b;
    }

    @Override
    public List<Book> getByPrice(double prix) throws SQLException {
        Statement st = null;
        st = connection.createStatement();
        ResultSet rs = null;
        rs = ((Statement) st).executeQuery("select * from book where price <="+prix);
        List<Book> res = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book b = new Book(id, title, price);
            res.add(b);
        }
        return res;
    }

    @Override
    public List<Book> getByTitle(String titre) throws SQLException {
        Statement st = null;
        st = connection.createStatement();
        ResultSet rs = null;
        rs = ((Statement) st).executeQuery("select * from book where title iLike'%"+titre+"%'");
        List<Book> res = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            Book b = new Book(id, title, price);
            res.add(b);
        }
        return res;
    }

    //@Override
    public List<Book> getByAuthor(String nom) throws SQLException {
        Statement st = null;
        st = connection.createStatement();
        ResultSet rs = null;
        rs = ((Statement) st).executeQuery("select * from book, bookauthor, author where book.id=bookauthor.idbook and author.id=bookauthor.idauthor and author.nom="+"'"+nom+"'");
        List<Book> res = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String title = rs.getString("title");
            double price = rs.getDouble("price");
            //String title = rs.getString("title");
            Book b = new Book(id, title, price);
            res.add(b);
        }
        return res;
    }
}
