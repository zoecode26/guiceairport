package com.company;

public class Plane {

    private final String name;
    private boolean airborne;

    public Plane(String name){
        this.name = name;
        this.airborne = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAirborne() {
        return airborne;
    }

    public void setAirborne(boolean airborne) {
        this.airborne = airborne;
    }
}
