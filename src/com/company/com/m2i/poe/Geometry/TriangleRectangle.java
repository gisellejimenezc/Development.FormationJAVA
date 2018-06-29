package com.company.com.m2i.poe.Geometry;

import static java.lang.Math.*;

public class TriangleRectangle extends Rectangle {

    public TriangleRectangle(double width, double height) {
        super(width, height);
    }

    double getSurfaceT(){
        double surface = getWidth()*getHeight()/2;
        System.out.println("La surface est égal a "+ surface);
        return surface;
    }

    double getHypothenuse(){
        double hypothenuse = sqrt(pow(getWidth(),2)*pow(getHeight(),2));
        System.out.println("L'hypothenuse est égal a "+ hypothenuse);
        return hypothenuse;
    }

    double getPerimetre(){
        double perimetre = getWidth()+getHeight()+getHypothenuse();
        System.out.println("Le perimetre est égal a "+ perimetre);
        return perimetre;
    }


// Herite de Rectangle
    // getSurface
    // Hypothenuse
    // Perimetre
}
