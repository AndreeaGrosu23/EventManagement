package com.andreeagrosu;

public class Conference extends EventFactory {

    public Conference() {
        super(Events.CONFERENCE);
    }

    @Override
    public void helpersAction() {
        System.out.println("Please find the snacks next to the beverages stand on the right side");
    }
}
