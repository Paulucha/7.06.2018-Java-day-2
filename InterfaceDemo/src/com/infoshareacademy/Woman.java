package com.infoshareacademy;

public class Woman implements Human {
    @Override
    public void smile() {
        System.out.println("smiej sie");

    }

    @Override
    public void cry() {
        System.out.println("placz babo");

    }

    public void jump(){
        System.out.println("skacz babo");
    }
}
