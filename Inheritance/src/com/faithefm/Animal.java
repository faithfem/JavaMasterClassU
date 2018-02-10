package com.faithefm;

public class Animal {

    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;


    //CREATE A NEW CLASS, DOG THAT WILL INHERIT FROM THIS ANIMAL CLASS SO U DON'T HAVE TO WRITE CODE TWICE
    //CREATED CONSTRUCTOR FOR ALL VARIABLES ABOVE
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;

    }

    //YOU CAN ALSO CREATE METHODS FOR THE ANIMALS, E.G., THEY ALL EAT, MOVE, ETC

    public void eat(){
        System.out.println("Animal.eat() called");
    }

    public void move(int speed ){
        System.out.println("Animal is moving at " + speed);

    }

    //CREATED GETTERS TO ACCESS THE FIELDS WE WANT
    public String getName() {
        return name;
    }
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

}
