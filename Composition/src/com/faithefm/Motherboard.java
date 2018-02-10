package com.faithefm;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;


    //CONSTRUCTOR

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    //METHOD

    public void loadProgram(String programName){ //In this method, we have a parameter. Not so in Case Class
        System.out.println("Computer is on");
    }

    //GETTERS

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
