package com.company.com.m2i.poe.GeneticCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Ribosome {

    private static HashMap<String, String> codonMap = new HashMap<>();
    {
        codonMap.put("UUU","F");
        codonMap.put("UUC","F");
        codonMap.put("UUA","L");
        codonMap.put("UUG","L");
        codonMap.put("CUU","L");
        codonMap.put("CUC","L");
        codonMap.put("CUA","L");
        codonMap.put("CUG","L");
        codonMap.put("AUU","I");
        codonMap.put("AUC","I");
        codonMap.put("AUA","I");
        codonMap.put("AUG","M");
        codonMap.put("GUU","V");
        codonMap.put("GUC","V");
        codonMap.put("GUA","V");
        codonMap.put("GUG","V");
        codonMap.put("UCU","S");
        codonMap.put("UCC","S");
        codonMap.put("UCA","S");
        codonMap.put("UCG","S");
        codonMap.put("CCU","P");
        codonMap.put("CCC","P");
        codonMap.put("CCA","P");
        codonMap.put("CCG","P");
        codonMap.put("ACU","T");
        codonMap.put("ACC","T");
        codonMap.put("ACA","T");
        codonMap.put("ACG","T");
        codonMap.put("GCU","A");
        codonMap.put("GCC","A");
        codonMap.put("GCA","A");
        codonMap.put("GCG","A");
        codonMap.put("UAU","Y");
        codonMap.put("UAC","Y");
        codonMap.put("UAA"," ");
        codonMap.put("UAG"," ");
        codonMap.put("CAU","H");
        codonMap.put("CAC","H");
        codonMap.put("CAA","Q");
        codonMap.put("CAG","Q");
        codonMap.put("AAU","N");
        codonMap.put("AAC","N");
        codonMap.put("AAA","K");
        codonMap.put("AAG","K");
        codonMap.put("GAU","D");
        codonMap.put("GAC","D");
        codonMap.put("GAA","E");
        codonMap.put("GAG","E");
        codonMap.put("UGU","C");
        codonMap.put("UGC","C");
        codonMap.put("UGA"," ");
        codonMap.put("UGG","W");
        codonMap.put("CGU","R");
        codonMap.put("CGC","R");
        codonMap.put("CGA","R");
        codonMap.put("CGG","R");
        codonMap.put("AGU","S");
        codonMap.put("AGC","S");
        codonMap.put("AGA","R");
        codonMap.put("AGG","R");
        codonMap.put("GGU","G");
        codonMap.put("GGC","G");
        codonMap.put("GGA","G");
        codonMap.put("GGG","G");
    }


    public ArrayList<String> getCodonList(SADN cARN) {
        ArrayList<String> codonList = new ArrayList<>();
        int n = cARN.getBrin().size();
        for (int i = 0; i < n-2; i=i+3) {
            codonList.add(cARN.getBrin().get(i).getSymbol() + cARN.getBrin().get(i + 1).getSymbol() + cARN.getBrin().get(i + 2).getSymbol());
        }
        return codonList;
    }

    public ArrayList<AminoAcid> translate(ArrayList<String>codonList){
        ArrayList<AminoAcid> peptide = new ArrayList<>();
        int n = codonList.size();
        for (int i=0; i <n; i++){
            String lettreDeAminoacid = codonMap.get(codonList.get(i));
            AminoAcid aa = new AminoAcid(lettreDeAminoacid);
            peptide.add(aa);
        }
        return peptide;

    }


  }

