package com.infoshareacademy;

public class Cat extends Animal {

    private boolean hungry;

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    @Override
    public String getName() {
        System.out.println("getName z Cat");
        return super.getName();


    }
}
