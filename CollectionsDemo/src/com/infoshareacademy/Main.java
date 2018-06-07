package com.infoshareacademy;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("login1", "imie1");

        if (myMap.containsKey("login2") == false) {


            myMap.put("login2", "imie2");
        }
        if (!myMap.containsKey("login3")) {
            myMap.put("login3", "imie3");
        }
        myMap.put("login3", "imie3.4");
        myMap.put("login4", "imie4");

        for (String login : myMap.values()) {
            System.out.println(login);
        }


//        ArrayList<String> names = new ArrayList<>();
//        <String> names = new TreeSet<String>();
//        names.add("Zdzis");
//        names.add("Roman");
//        names.add("Ania");
//        names.add("1Kasia");
//        names.add("Basia");
//        names.add("Zdzis");
//        names.add("ania");

//        for (String name : names) {    // wypisz wszystkie obiekty z kolekcji (petla for each)
//            System.out.println(name);
//        }
//        System.out.println(names.get(3)); // wypisuje 3 obiekt ze środka Lity

//        int[] tab = createArray (10);
//        for (int i = tab.length-1; i>=0; i--){
//            System.out.println(tab[i]);
//        }
//
//    }
//    private static  int[] createArray(int size) {
//        int[] array = new int[size];
//
//        int i = 0;
//        int j = 0;
//        while (i < size) {
//            j = j + 2;
//            array[i] = j;
//            i++;
//
//
//        }
//        return array;

    }
}


