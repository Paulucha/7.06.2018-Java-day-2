package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Cat myAnimal = new Cat(); // zmienna myAnimal, typu animal/Cat  z przypisanym kotem, trzeba extendowac animala do cata - public class Cat extends Animal
        myAnimal.setName("Gucio");
        System.out.println(myAnimal.getName());
    }
}
