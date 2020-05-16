package com.company;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal("Dog");

        dog.name="Haiko";


        System.out.println("I am "+dog.name);

        dog.feed();
        dog.feed();
        dog.feed();


        Human me = new Human();
        me.firstName="Jan";
        me.lastName="Dembowski";
        me.pet = dog;


    }
}
