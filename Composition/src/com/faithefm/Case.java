package com.faithefm;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    //private int dimensions;
    private int height;
    private int width;
    private int depth;

    //CONSTRUCTOR

    public Case(String model, String manufacturer, String powerSupply, int dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        //this.dimensions = dimensions;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    //METHOD

    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    //GETTERS


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    /*public int getDimensions() {
        return dimensions;*/

    public int getHeight(){
        return height;
    }
    public int getWidth(){
        return width;
    }

    public int getDepth(){
        return depth;
    }


}
