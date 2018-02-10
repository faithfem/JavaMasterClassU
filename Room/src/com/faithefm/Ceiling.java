package com.faithefm;

public class Ceiling {
    private int height;
    private String paintedColor;

    //CONSTRUCTOR
    public Ceiling(int height, String paintedColor){
        this.height = height;
        this.paintedColor = paintedColor;
    }

    //METHOD
    public void paintCeiling(){
        System.out.println("Susan will paint the ceiling a " + paintedColor + " color. The ceiling is " +
        height + " feet high.");
    }

    //GETTERS
    public int getHeight() {
        return height;
    }

    public String getPaintedColor() {
        return paintedColor;
    }
}
