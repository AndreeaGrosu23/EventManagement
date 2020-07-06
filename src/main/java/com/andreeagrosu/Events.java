package com.andreeagrosu;

public enum Events {
    COCKTAIL("Cocktail", 5),
    WEDDING("Wedding", 8),
    CONFERENCE("Conference", 10);

    private final String eventName;
    private final int duration;

    Events(String eventName, int duration) {
        this.eventName = eventName;
        this.duration = duration;
    }

    public String getEventName() {
        return eventName;
    }

    public int getDuration() {
        return duration;
    }
}
