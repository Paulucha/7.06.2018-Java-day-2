package com.infoshareacademy;

public final class Device { // jeżeli jest tu FINAL to po niej nie można dziedziczyć, temu w Mobile.java jest błąd
    public void turnOn (){
        System.out.println("Wlaczylem sie");

    }
    public void turnOff(){
        System.out.println("Wylaczylem sie");


    }
}
