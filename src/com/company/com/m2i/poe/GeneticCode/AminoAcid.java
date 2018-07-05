package com.company.com.m2i.poe.GeneticCode;

public class AminoAcid {

    private String symbol;
    private String name;

    public AminoAcid(String symbol) {
        symbol = symbol.toUpperCase();
        this.symbol = symbol;


       /* switch (trigram) {
            case "AAA":
                name = "Lysine";
                symbol = "K";
                break;
            case "GGG":
                name = "Glycine";
                symbol = "G";
                break;
            case "CCC":
                name = "Proline";
                symbol = "P";
                break;
            case "UUU":
                name = "Phenylalanine";
                symbol = "F";
                break;
            }*/
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return symbol;
    }

    /*- symbol : String
          - trigram : String
          - name : String
          + AminoAcid()
          + getSymbol()
          + getTrigram()
          + getName()
          + toString()*/

}
