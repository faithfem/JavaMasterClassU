package com.faithefm;

public class Light {

    private int numOfLights;
    private String manufacturer;

    //CONSTRUCTOR
    public Light(int numOfLights, String manufacturer){
        this.numOfLights = numOfLights;
        this.manufacturer = manufacturer;
    }

    //METHOD
    public void turnOnLight(){
        System.out.println("Gabriel turned on " + numOfLights + " light(s)");
    }

    //GETTERS


    public int getNumOfLights() {
        return numOfLights;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
