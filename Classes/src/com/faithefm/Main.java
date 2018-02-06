package com.faithefm;

public class Main {

    public static void main(String[] args) {
	    Car porsche = new Car(); //created a new object, porsche based on template car
        Car toyota = new Car();

        porsche.setModel("Carrera");

        System.out.println("Model is " + porsche.getModel());

        //When you create CLASSES, make sure you always use the KEYWORD "NEW"

    }
}
