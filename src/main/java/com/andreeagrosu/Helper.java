package com.andreeagrosu;

import java.util.Random;

public class Helper extends Employee {

    private Random random = new Random();

    public Helper(String name, double salary) {
        super(name, salary);
        System.out.println("New helper created");
    }

    public Random getRandom() {
        return random;
    }

    public boolean isSmoker() {
        return getRandom().nextBoolean();
    }

    public void takeBreak() {
        if (isSmoker()) {
            System.out.println("Taking smoking break.");
        } else {
            System.out.println("Taking coffee break.");
        }
    }

}
