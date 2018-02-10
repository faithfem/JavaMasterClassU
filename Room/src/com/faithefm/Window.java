package com.faithefm;

public class Window {
    private int numofWindows;
    private String manufacturer;

    //CONSTRUCTOR

    public Window(int numofWindows, String manufacturer){
        this.numofWindows = numofWindows;
        this.manufacturer = manufacturer;

    }

    //METHOD

    public void installWindows(){
        System.out.println("Buy " + numofWindows + " windows, manufactured by " + manufacturer);
    }

    //GETTERS
    public int getNumofWindows() {
        return numofWindows;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
