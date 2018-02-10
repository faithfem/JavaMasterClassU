package com.faithefm;

public class Main {

    public static void main(String[] args) {

        //Variables
        Door theDoor  = new Door(1);
        Window theWindow = new Window(6,"HaberWindows");
        Light theLight = new Light(3, "Edison");
        Ceiling theCeiling = new Ceiling(15, "red");
        Room theRoom  = new Room(theDoor, theWindow, theLight, theCeiling);


        //CALL THE METHODS
        theRoom.getDoor().opensDoor();
        theRoom.getWindow().installWindows();
        theRoom.getLight().turnOnLight();
        theRoom.getCeiling().paintCeiling();
    }
}
