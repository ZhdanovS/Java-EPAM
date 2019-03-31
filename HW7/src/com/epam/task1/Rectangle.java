package com.epam.task1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    Rectangle (String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return  "class: "+ this.getClass().getSimpleName() + " color: " + this.color + " width: " + this.width + " height: " + this.height;
    }

    @Override
    double calcArea(){
        return width * height;
    }
}
