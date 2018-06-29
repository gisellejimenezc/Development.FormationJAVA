package com.company.Media;

public class Author {

    private int id;
    private String lastName;
    private String name;

    public Author() {
    }

    public Author(int id, String lastName, String name) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
