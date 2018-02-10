package com.faithefm;

public class Main {

    public static void main(String[] args) {

        //Call each Class into the Main class
        Case theCase = new Case("220B","Dell", "240",(20,20,5)); //dimensions r an issue
        Monitor monitor = new Monitor("Dell220", "Dell", 27,(1080,720)); //resolutions issue
        Motherboard motherboard = new Motherboard("IBM2000","IBM",8,10,"700");

        //Call the class that COMPOSES all the above

        PC thePC = new PC(theCase, monitor, motherboard);

        //CALL THE METHODS in each Class:

        thePC.getMonitor().drawPixelAt(1500, 1200,"red");
        thePC.getMotherboard().loadProgram("Windows 10");
        thePC.getTheCase().pressPowerButton();
    }
}
