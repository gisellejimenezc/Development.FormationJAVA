package com.company.com.m2i.poe.GeneticCode;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        SADN sadn = new SADN("AAACCCgggttt");

        System.out.println(sadn);

        SADN brin = sadn.getComplementary();
        System.out.println(brin);

        SADN arn = sadn.getARN();
        System.out.println(arn);

        Ribosome ribosome = new Ribosome();
        ArrayList<String> codons = ribosome.getCodonList(arn);

        System.out.println(codons);

        ArrayList<AminoAcid> peptide = ribosome.translate(codons);
        System.out.println(peptide);

        DNARepository repo = new DNARepository();
        repo.load("sequence.csv");
        System.out.println(repo.getString());
        SADN sadn1 = new SADN(repo.getString());
        SADN arn1 = sadn1.getARN();

        Ribosome ribosome1 = new Ribosome();
        ArrayList<String> codons1 = ribosome1.getCodonList(arn1);
        //System.out.println(codons1);
        ArrayList<AminoAcid> peptide1 = ribosome1.translate(codons1);
        System.out.println(peptide1);


        //System.out.println(sadn1.getComplementary());

        //System.out.println(repo);

    }
}



