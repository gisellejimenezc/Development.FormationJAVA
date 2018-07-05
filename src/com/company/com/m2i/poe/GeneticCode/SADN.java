package com.company.com.m2i.poe.GeneticCode;

import java.util.ArrayList;


public class SADN {

    private ArrayList <Base> brin = new ArrayList<>();

    public ArrayList<Base> getBrin() {
        return brin;
    }

    public SADN(ArrayList<Base> brin) {
     }

     public SADN(String brin) {
         for (int i = 0; i < brin.length(); i++){
             String lettre = String.valueOf(brin.charAt(i));
             this.brin.add(new Base(lettre));
         }
     }


     public String toString() {
         return "SADN{"+ brin +'}';
     }


     public SADN getComplementary(){
         SADN cADN = new SADN(brin);
         for (Base b: brin){
             cADN.brin.add(b.getComplementary(true));
         }
         return cADN;
     }


     public SADN getARN(){
         SADN cARN = new SADN(brin);
         for (Base b: brin){
             cARN.brin.add(b.getComplementary(false));
         }
         return cARN;
     }


 }

