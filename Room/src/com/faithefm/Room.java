package com.faithefm;

public class Room {

    private Door door;
    private Window window;
    private Light light;

    //CONSTRUCTOR

    public Room(Door door, Window window, Light light){
        this.door = door;
        this.window = window;
        this.light = light;
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
}
