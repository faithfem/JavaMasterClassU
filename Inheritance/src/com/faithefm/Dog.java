package com.faithefm;

public class Dog extends Animal{

    // USE KEYWORD "extends" TO RELATE THIS CLASS TO THE ANIMAL CLASS

    // CAN CREATE VARIABLES THAT ARE UNIQUE TO DOGS ONLY
    private boolean eyes;
    private int eyesNumber;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;



    // CREATE A CONSTRUCTOR THAT CALLS THE CONSTRUCTOR FOR ANIMAL

    public Dog(/*int brain, int body,*/ int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) { //INITIALIZE DOGS PARAMS TOO
        super(1, 1, size, weight, name); //SUPER CLASS IS THE ANIMAL CLASS.
        // INITIALIZED BRAIN & BODY INSIDE THE CONSTRUCTOR, SO NOT NEEDED IN LINE ABOVE THAT SO COMMENTED OUT
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;


    }

}
