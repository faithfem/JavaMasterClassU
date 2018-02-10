package com.faithefm;

public class Monitor {

    //First thing after creating a class is to create the variables
    //We'll add variables of model, manufacturer, size and resolution
    //Start variable creation with "private" since we don't want them publicly accessible, then int or string etc as needed

    private String model;
    private String manufacturer;
    private int size;
    private int resolution;

    //After creating variables, create a CONSTRUCTOR for each variable.
    //CONSTRUCTORS start with "public" then the Class name, then brackets() and inside those brackets, enter
    //the variable part after "private", then squigly brackets, then
    //this.variable name = variable name;

    public Monitor(String model, String manufacturer, int size, int resolution){
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    //After the Constructor, create a METHOD
    //METHODS start with "public void" then give it a method name, then enter the params inside (), then
    //SOUT to print and whatever you want to print.

    public void drawPixelAt(int x, int y, String color){ //THIS IS READING FROM THE RESOLUTION CLASS
        System.out.println("Drawing pixel at " + x + "," + y + "," + "in color " + color );
    }

    //After the Method, create GETTERS for each variable.
    //GETTERS start with "public".
    //If a variable was a string, then it would be public String getVariableName(){ return variableName;}
    //If a variable was an int, it would be public int getVariableName(){ return variableName;}


    public String getModel() {
        return model;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public int getResolution() {
        return resolution;
    }
}
