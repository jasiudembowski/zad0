package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    private Double weight=1.0;
    File pic;

    public Animal(String species) {
        this.species = species;

    }


    void feed(){
        weight++;
        System.out.println("New weight is"+weight);
    }
}
