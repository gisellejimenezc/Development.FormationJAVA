package com.company.com.m2i.poe.GeneticCode;

import java.util.ArrayList;
import java.util.Arrays;


 public class SADN {

    private ArrayList <Base> brin = new ArrayList<>();

     public SADN() {
     }

     public SADN(String brin) {
         for (int i = 0; i < brin.length(); i++){
             String lettre = String.valueOf(brin.charAt(i));
             this.brin.add(new Base(lettre));
         }
     }

     @Override
     public String toString() {
         return "SADN{"+ brin +'}';
     }

     public SADN getBrinComplementary(){
         SADN cADN = new SADN();
         for (Base b: brin){
             cADN.brin.add(b.getComplementary(true));
         }
         return cADN;
     }

     public SADN getARN(){
         SADN cADN = new SADN();
         for (Base b: brin){
             cADN.brin.add(b.getComplementary(false));
         }
         return cADN;
     }


 }

