package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
	String first = new String ("iSa");
    String second = new String ("iSa");
        System.out.println("first == second " + (first == second));
        System.out.println("first equals second " + (first.equals(second)));
        System.out.println("first hashCode = " + first.hashCode());
        System.out.println("second hashCode = " + second.hashCode());
    }
}
