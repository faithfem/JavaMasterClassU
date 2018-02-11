package com.faithefm;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Porter";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());

        //Since Variables are private in Enhanced player, we'll use the getters to get access.
        EnhancedPlayer player = new EnhancedPlayer("Pat", -1, "Saber");
        System.out.println("Initial health is " + player.getHealth());
//        EnhancedPlayer.name = "Porter";
//        EnhancedPlayer.health = 20;
//        EnhancedPlayer.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());


    }
}
