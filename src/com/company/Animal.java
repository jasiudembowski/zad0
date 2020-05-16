package com.company;

import java.io.File;

public class Animal {
    final String species;
    String name;
    static final Double STANDARD_CAT_WEIGHT = 20.0;
    File pic;
    static final Double STANDARD_DOG_WEIGHT = 70.0;
    static final Double STANDARD_SPIDER_WEIGHT  = 1.0;
    private Double weight;


    public Animal(String species) {
        this.species = species;

    }


    void feed() {
        weight++;
        System.out.println("New weight is" + weight);

        if (weight <= 0) {
            System.out.println("You can't walk with dead animal");
        }
    }
    void takeForAWalk() {
        weight--;
        System.out.println("New weight is" + weight);

         if(weight<=0) {
            System.out.println("you can't go outside because they are dead");
        }
    }
}



