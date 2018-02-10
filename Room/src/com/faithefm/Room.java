package com.faithefm;

public class Room {

    private Door door;
    private Window window;
    private Light light;
    private Ceiling ceiling;

    //CONSTRUCTOR

    public Room(Door door, Window window, Light light, Ceiling ceiling){
        this.door = door;
        this.window = window;
        this.light = light;
        this.ceiling = ceiling;
    }

    //METHOD
    //looks like no method

    //GETTERS
    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }

    public Light getLight() {
        return light;
    }
    public Ceiling getCeiling(){
        return ceiling;
    }
}
