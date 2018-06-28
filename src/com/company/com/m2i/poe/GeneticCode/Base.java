package com.company.com.m2i.poe.GeneticCode;


public class Base {

    private String symbol;
    private String name;
    private String family;

    public Base() {
    }

    public Base(String symbol) {
        symbol = symbol.toUpperCase();
        this.symbol = symbol;
        switch (symbol) {
            case "A":
                name = "Adenine";
                family = "Purine";
                break;
            case "G":
                name = "Guanine";
                family = "Purine";
                break;
            case "C":
                name = "Cytosine";
                family = "Pyrimidine";
                break;
            case "T":
                name = "Thymine";
                family = "Pyrimidine";
                break;
            case "U":
                name = "Uracil";
                family = "Pyrimidine";


        }
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    @Override
    public String toString() {
        return "{"+symbol+'}';
    }

    public Base getComplementary(boolean bool) {
       Base b = new Base();
        switch (this.symbol){
            case "A" :
                if (bool){
                    b = new Base ("T");
                }else {
                    b = new Base ("U");
                }
                break;
            case "G" :
                b = new Base ("C");
                break;
            case "C":
                b = new Base ("G");
                break;
            case "T":
                b = new Base ("A");
                break;

        }
        return b;
    }
    /*public Base getComplementary() {
        Base b = new Base();
        switch (this.symbol){
            case "A" :
                b = new Base ("T");
                break;
            case "G" :
                b = new Base ("C");
                break;
            case "C":
                b = new Base ("G");
                break;
            case "T":
                b = new Base ("A");
                break;

        }
        return b;
    }*/

    /*public Base getARN() {
        Base b = new Base();
        switch (this.symbol){
            case "A" :
                b = new Base ("U");
                break;
            case "G" :
                b = new Base ("C");
                break;
            case "C":
                b = new Base ("G");
                break;
            case "T":
                b = new Base ("A");
                break;

        }
        return b;
    }*/

}




