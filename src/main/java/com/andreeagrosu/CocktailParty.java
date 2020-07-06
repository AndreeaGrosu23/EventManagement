package com.andreeagrosu;

public class CocktailParty extends EventFactory {

    public CocktailParty() {
        super(Events.COCKTAIL);
    }

    @Override
    public void helpersAction() {
        System.out.println("Do you want more cocktails?");
    }
}
