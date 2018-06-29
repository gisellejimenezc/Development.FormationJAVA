package com.company.Media;

public class Publisher {

    private int id;
    private String nom;

    public Publisher(){
    }

    public Publisher(int id,String nom){
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                '}';
    }
}
