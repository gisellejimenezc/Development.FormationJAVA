package com.company.Media;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BookRepository implements IBookRepository {

   List<Book> bookList = new ArrayList<>();

    public void load (String uri) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(uri));
        reader.readLine();
        String line = reader.readLine();//saute la prémiere ligne
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line, ";");
            //st.nextToken();
            Book b = new Book();
                b.setId(Integer.parseInt(st.nextToken()));
                b.setTitle(st.nextToken());
                b.setPrice(Double.parseDouble(st.nextToken()));
                b.setNbPage(Integer.parseInt(st.nextToken()));
                Publisher publisher = new Publisher(st.nextToken());
                b.setPublisher(publisher);
            line = reader.readLine();
            bookList.add(b);
        }
        reader.close();
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "bookList=" + bookList +
                '}';
    }

    @Override
    public List<Book> getAll() throws IOException {
        return bookList;
    }

    @Override
    public Book getById(int id) {
        Book bId = new Book();
        for (Book b : bookList ){
            if (id == b.getId()){
               bId = b;
               break;
            }
        }
        return  bId;
    }

    @Override
    public List<Book> getByTitle(String title) {
        List<Book> bookByTitle = new ArrayList<>();
        for (Book b : bookList) {
            if (b.getTitle().contains(title)) {
                bookByTitle.add(b);
            }
        }
        return bookByTitle;
    }

    @Override
    public List<Book> getByPrice(double price) {
        List<Book> bookByPrice = new ArrayList<>();
        for (Book b : bookList ) {
            if (price >= b.getPrice()) {
                bookByPrice.add(b);
            }
        }
        return bookByPrice;
    }

    @Override
    public List<Book> getByPublisher(String publisherName) {
        List<Book> bookByPublisher = new ArrayList<>();
        for (Book b : bookList) {
            if (publisherName.equals(b.getPublisher().getName())) {
                bookByPublisher.add(b);
            }
        }
        return bookByPublisher;
    }
}
