package com.andreeagrosu;

public class Chief extends Manager {

    private static Chief instance = null;

    private Chief(String name, double salary) {
        super(name, salary);
    }

    public static Chief getInstance(String name, double salary) {
        if (instance==null) {
            instance=new Chief(name, salary);
            System.out.println("Chief is singleton");
        }
        return instance;
    }
}
