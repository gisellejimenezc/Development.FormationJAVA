package com.company.Media;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("B001","La mort d'Ivan Illich", 5, 80 );
        CD c1 = new CD("C001","Alberto Plazas", 8, 15 );
        DVD d1 = new DVD("D001","Ethernal Sunshine", 10, 1 );

        b1.getNetPrice();  //5.25
        //System.out.println(b1.toString());
        c1.getNetPrice(); //9.6
        d1.getNetPrice(); // 8.0


        Book b3 = new Book("B003", "El olvido que seremos", 15, 250);
        b3.getNetPrice();
        String author1 = "Hector Fancioli";
        /* b3.setAuthor1()=author1; */



        Media m = new Book("B002", "Lo que no tiene nombre", 10, 200);
        m = new CD("C002", "Plancha",15, 20);
        m = new DVD( "D003", "Coco",15,2);
        m.getNetPrice();
        m.setPublisher(new Publisher(4,"Bonnett"));
        System.out.println(m.getPublisher());
        m.getAuthorList().add(new Author(5, "Bonnett", "Piedad"));

    }
}
