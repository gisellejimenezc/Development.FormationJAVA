package com.company.com.m2i.poe.GeneticCode;

public class Main {

    public static void main(String[] args){

        /*Base base = new Base("G");
        System.out.println(base);*/
        //String sadn = "agct";
        SADN sadn = new SADN("AGTCagtc");

        /*System.out.println(base.getComplementary());
        System.out.println(base.getARN());*/
        System.out.println(sadn);

        SADN cADN = new SADN();
        cADN = sadn.getBrinComplementary();
        System.out.println(cADN);

        SADN arn = new SADN();
        arn = sadn.getARN();
        System.out.println(arn);
    }
}



