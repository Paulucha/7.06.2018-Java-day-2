package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {

        String myText = "   I Hate   snow!    ";
        System.out.println(myText); // tekst z nadmiarem spacji
        System.out.println(myText = myText.trim()); // usunięcie spacji z początku i końca
        System.out.println(myText = myText.replace("   ", " ")); // usunięcie spacji ze środka
        System.out.println(myText = myText.replace("Hate", "love")); // zamienienie Hate na love
        System.out.println(myText.toUpperCase()); // zamienienie wszystkich liter an wielkie

    }

}
