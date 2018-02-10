package com.faithefm;

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    //This is the constructor
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1,10,5);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(){
        moveMuscles();
        moveBackFin();
        super.move(5);
    }


}
