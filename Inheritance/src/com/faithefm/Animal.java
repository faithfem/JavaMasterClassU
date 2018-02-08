package com.faithefm;

public class Animal {

    private int brain;
    private int body;
    private int size;
    private int weight;
    private String name;

    //CREATE A NEW CLASS, DOG THAT WILL INHERIT FROM THIS ANIMAL CLASS SO U DON'T HAVE TO WRITE CODE TWICE
    //CREATED CONSTRUCTOR FOR ALL VARIABLES ABOVE
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    //YOU CAN ALSO CREATE METHODS FOR THE ANIMALS, E.G., THEY ALL EAT, MOVE, ETC

    private void eat(){

    }

    private void move(){

    }

    //CREATED GETTERS TO ACCESS THE FIELDS WE WANT
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

    public String getName() {
        return name;
    }
}
