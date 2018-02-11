package com.faithefm;

public class Player {

    //Create Variables

    public String name;
    public int health;
    public String weapon;
    //METHODS

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if(this.health <=0){
            System.out.println("Player is knocked out");
        }
    }

    public int healthRemaining(){
        return this.health;
    }
}
