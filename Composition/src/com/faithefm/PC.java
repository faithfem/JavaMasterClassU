package com.faithefm;

public class PC {

    //In the PC Class, we'll put together the Monitor, Case & Motherboard to create a PC
    //So our variables will be composed of these.
    //These variables will be private

    private Case theCase; //can't use "case" as it's a reserved word, so will use "theCase"
    private Monitor monitor;
    private Motherboard motherboard;

    //CONSTRUCTOR

    public PC(Case theCase, Monitor monitor, Motherboard motherboard){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    //METHOD
        //No methods

    //GETTERS
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
