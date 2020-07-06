package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Manager extends Employee {

    List<Helper> helperList;
    private Random random = new Random();

    public Manager(String name, double salary) {
        super(name, salary);
        System.out.println("New manager created");
    }

    public boolean checkIfEnoughHelpers(List<Helper> helperList) {
        if (helperList.size()==10) {
            System.out.println("We have the correct number of helpers!");
            return true;
        }
        System.out.println("We don't have enough helpers..");
        return false;
    }

    public Random getRandom() {
        return random;
    }

    public boolean isAppropriateCatering() {
        return getRandom().nextBoolean();
    }

    public boolean eventCanStart(List<Helper> helperList) {
        if (checkIfEnoughHelpers(helperList) && isAppropriateCatering()) {
            System.out.println("Event can start!");
            return true;
        }
        System.out.println("Event not ready to start..");
        return false;
    }

}
