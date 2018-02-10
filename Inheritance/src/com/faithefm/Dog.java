package com.faithefm;

public class Dog extends Animal{

    // USE KEYWORD "extends" TO RELATE THIS CLASS TO THE ANIMAL CLASS

    // CAN CREATE VARIABLES THAT ARE UNIQUE TO DOGS ONLY
    private int eyes;
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

      private void chew(){
          System.out.println("Dog.chew() called");
      }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override //The super MOVE method will be called instead of the generic MOVE method.
    public void move(int speed) {
        super.move(speed);
        System.out.println("Dog.move() called");
        moveLegs(speed);

    }
}
