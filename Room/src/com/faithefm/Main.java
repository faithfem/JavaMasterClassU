package com.faithefm;

public class Main {

    public static void main(String[] args) {

        //Variables
        Door theDoor  = new Door(1);
        Window theWindow = new Window(6,"HaberWindows");
        Light theLight = new Light(3, "Edison");
        Room theRoom  = new Room(theDoor, theWindow, theLight);

        //CALL THE METHODS
        theRoom.getDoor().opensDoor();
        theRoom.getWindow().installWindows();
        theRoom.getLight().turnOnLight();




    }
}
