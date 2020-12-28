package com.company;

import com.google.inject.Inject;

import java.util.ArrayList;

public class Airport{

    private final String name;
    private Weather weather;
    private ArrayList<Plane> planes;
    private int capacity;

    Airport(String name){
        this.name = name;
    }

    Airport(int capacity, String name){
        this.capacity = capacity;
        this.name = name;
    }

    @Inject
    public void setup(Weather weather){
        this.planes = new ArrayList<Plane>();
        this.weather = weather;
    }

    public void land(Plane plane){
        if (this.weather.forecast().equals("stormy")) {
            System.out.println("WEATHER IS STORMY - " + plane.getName() + " CANNOT LAND");
        }
        else if (this.planes.contains(plane)){
            System.out.println(plane.getName() + " ALREADY LANDED AT " + this.name);
        }
        else if (this.planes.size()>=this.capacity){
            System.out.println(this.name + " FULL");
        }
        else if (!plane.isAirborne()){
            System.out.println(plane.getName() + "IS NOT AIRBORNE AND THEREFORE CANNOT LAND");
        }
        else{
            this.planes.add(plane);
            plane.setAirborne(false);
            System.out.println(plane.getName() + " LANDED SUCCESSFULLY");
        }
    }

    public void take_off(Plane plane){
        if (this.weather.forecast().equals("stormy")) {
            System.out.println("WEATHER IS STORMY - " + plane.getName() + " CANNOT TAKE OFF");
        }
        else if (this.planes.isEmpty()){
            System.out.println(this.name + " EMPTY");
        }
        else if (!this.planes.contains(plane)){
            System.out.println(plane.getName() + " NOT AT " + this.name);
        }
        else if (plane.isAirborne()){
            System.out.println(plane.getName() + "IS AIRBORNE AND THEREFORE CANNOT TAKEOFF");
        }
        else{
            this.planes.remove(plane);
            plane.setAirborne(true);
            System.out.println(plane.getName() + " TAKEN OFF SUCCESSFULLY");
        }
    }

    public void get_planes(){
        System.out.println("PLANES AT " + this.name + ":");
        for (Plane plane : this.planes) {
            System.out.println(plane.getName());
        }
    }

    public int getCapacity() {
        return capacity;
    }
}
