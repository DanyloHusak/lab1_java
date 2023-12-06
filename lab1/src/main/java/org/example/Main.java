package org.example;


public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal.Builder()
                .setSpecies("Dog")
                .setAge(3)
                .build();

        Cat cat = new Cat("Cat", 5, "Black");
        System.out.println("Animal toString(): " + animal.toString());
        System.out.println("Animal equals Cat: " + animal.equals(cat));
        System.out.println("Animal hashCode: " + animal.hashCode());

        System.out.println("Cat toString(): " + cat.toString());
        System.out.println("Cat equals Animal: " + cat.equals(animal));
        System.out.println("Cat hashCode: " + cat.hashCode());
    }
}