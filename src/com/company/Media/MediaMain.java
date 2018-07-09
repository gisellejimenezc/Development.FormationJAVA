package com.company.Media;

import java.io.IOException;
import java.sql.SQLException;

public class MediaMain {

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Media m2 = new Book(0,"",0);
        Media b = new Book(1,"Java",10);
        Media m = new Cd(2,"A que Johnny",20);
        m = new DVD(3, "Rambo 12", 30);
       System.out.println(((DVD) m).getNetPrice());
        m.setPublisher(new Publisher("Gaumont"));
        m.getAuthorList().add(new Author(5,"Silvester","Stallone"));
        int zone = ((DVD) m).getZone();
        Cart cart = new Cart();
        cart.add(b);
        cart.add(b);
        cart.add(m);

        cart.getTotalNetPrice();

        //BookRepository repo = new BookRepository();

       //repo.load("books.csv");
       // System.out.println(repo);

        //System.out.println(repo.getById(7));
        //System.out.println(repo.getByPrice(15.0));
        //System.out.println(repo.getByPublisher("Moi"));
       // System.out.println(repo.getByTitle("Java"));
        //repo.getAll();

        BookSqlRepository repo = new BookSqlRepository();
        try {
            repo.load("jdbc:postgresql://localhost:5432/postgres");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println(repo.getAll());
        System.out.println(repo.getById(3));
        System.out.println(repo.getByPrice(13.0));
        System.out.println(repo.getByTitle("El"));
        System.out.println(repo.getByAuthor("Lolo"));



    }
}
