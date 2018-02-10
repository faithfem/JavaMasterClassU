package com.faithefm;

public class Door {
    private int numberOfDoors;

    //CONSTRUCTOR

    public Door(int numberOfDoors){
        this.numberOfDoors = numberOfDoors;
    }

    //METHOD
    public void opensDoor(){
        System.out.println("The room has " + numberOfDoors + " door(s)" );
    }

    //GETTERS


    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}
