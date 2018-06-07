package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Human jacek = new Man() {
            @Override
            public void smile() {

            }
        };
        jacek.cry();
        jacek.smile();

    }
}
