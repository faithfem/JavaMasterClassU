package com.faithefm;

public class Main {

    public static void main(String[] args) {

        //Call each Class into the Main class
        //Need to create a new class "Dimensions"
        //Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell", "240", 5); //dimensions r an issue
        Monitor theMonitor = new Monitor("Dell220", "Dell",27,new Resolution(1040,720)); //resolutions issue
        Motherboard theMotherboard = new Motherboard("IBM2000","IBM",8,10,"700");

        //Call the class that COMPOSES all the above. This is the PC Class.

        PC thePC = new PC(theCase, theMonitor, theMotherboard);

        //CALL THE METHODS in each Class:

        thePC.getMonitor().drawPixelAt(1500, 1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
