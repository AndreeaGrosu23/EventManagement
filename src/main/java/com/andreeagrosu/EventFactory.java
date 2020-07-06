package com.andreeagrosu;

import java.util.ArrayList;
import java.util.List;

public abstract class EventFactory {

    Events event;
    Helper helper;
    List<Helper> helperList=null;
    Manager manager;
    List<Manager> managerList=null;
    final int numberHelpers=10;
    final int numberManagers=3;


    public EventFactory(Events event) {
        this.event = event;
    }

    public static EventFactory createEvent(Events event) {
        if (event==Events.COCKTAIL) {
            return new CocktailParty();
        } else if (event==Events.WEDDING) {
            return new Wedding();
        } else if (event==Events.CONFERENCE) {
            return new Conference();
        }
        return null;
    }

    public List<Helper> addHelpers(Helper helper) {
        if (helperList==null) {
            helperList = new ArrayList<>();
            helperList.add(helper);
            System.out.println("Helper added to event");
        } else if (helperList.size()<numberHelpers) {
            helperList.add(helper);
            System.out.println("Helper added to event");
        } else {
            System.out.println("No more helpers needed");
        }
        return helperList;
    }

    public List<Manager> addManager(Manager manager) {
        if (managerList==null) {
            managerList = new ArrayList<>();
            managerList.add(manager);
            System.out.println("Manager added to event");
        } else if (managerList.size()<numberManagers) {
            managerList.add(manager);
            System.out.println("Manager added to event");
        } else {
            System.out.println("No more managers needed");
        }
        return managerList;
    }

    public abstract void helpersAction();
}
