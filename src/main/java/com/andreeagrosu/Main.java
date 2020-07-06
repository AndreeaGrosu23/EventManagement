package com.andreeagrosu;

public class Main {

    public static void main (String[] args) {

        EventFactory cocktailParty = EventFactory.createEvent(Events.COCKTAIL);

        Helper helper1 = new Helper("John", 1000);
        Helper helper2 = new Helper("Joe", 1200);
        Helper helper3 = new Helper("Joel", 1050);
        Helper helper4 = new Helper("Jane", 1005);
        Helper helper5 = new Helper("Julian", 1100);
        Helper helper6 = new Helper("Jamie", 2000);
        Helper helper7 = new Helper("JayZ", 1700);
        Helper helper8 = new Helper("Jay", 1020);
        Helper helper9 = new Helper("Joanna", 1234);
        Helper helper10 = new Helper("Jillian", 1111);
        Helper helper11 = new Helper("Janna", 1001);

        cocktailParty.addHelpers(helper1);
        cocktailParty.addHelpers(helper2);
        cocktailParty.addHelpers(helper3);
        cocktailParty.addHelpers(helper4);
        cocktailParty.addHelpers(helper5);
        cocktailParty.addHelpers(helper6);
        cocktailParty.addHelpers(helper7);
        cocktailParty.addHelpers(helper8);
        cocktailParty.addHelpers(helper9);
        cocktailParty.addHelpers(helper10);
        cocktailParty.addHelpers(helper11);

        Manager manager1 = new Manager("George", 2000);
        Manager manager2 = new Manager("Dan", 2200);
        Manager manager3 = new Manager("Marius", 2500);
        Manager manager4 = new Manager("Elizabeth", 3000);

        cocktailParty.addManager(manager1);
        cocktailParty.addManager(manager2);
        cocktailParty.addManager(manager3);

        Chief chief = Chief.getInstance("John Doe", 4000);

        if (chief.eventCanStart(cocktailParty.helperList)) {
            cocktailParty.helpersAction();
            helper1.takeBreak();
            helper2.takeBreak();
            helper3.takeBreak();
            helper4.takeBreak();
            helper5.takeBreak();
            helper6.takeBreak();
            helper7.takeBreak();
            helper8.takeBreak();
            helper9.takeBreak();
            helper10.takeBreak();
        }
    }
}
