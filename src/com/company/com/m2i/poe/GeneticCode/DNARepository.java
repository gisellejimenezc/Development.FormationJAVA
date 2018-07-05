package com.company.com.m2i.poe.GeneticCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class DNARepository {

    String string;

    public DNARepository() {
    }

    public void load (String uri) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(uri));
        String line = reader.readLine(); // Lit la line mais la sauvegarde pas
        while (line != null) {
            string = line;
            line = reader.readLine(); // Pour passer a la line suivant
        }
        reader.close();
    }

    public String getString() {
        return string;
    }

    @Override
    public String toString() {
        return "DNARepository{}";
    }
}
