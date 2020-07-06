package com.andreeagrosu;

public class Wedding extends EventFactory {

    public Wedding() {
        super(Events.WEDDING);
    }

    @Override
    public void helpersAction() {
        System.out.println("Please have some more wedding cake!");
    }
}
