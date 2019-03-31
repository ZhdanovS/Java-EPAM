package com.epam.task1;

public class Circle extends Shape {
    private double radius;

    Circle (String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return  "class: "+ this.getClass().getSimpleName() + " | color: " + this.color + " | radius: " + this.radius;
    }

    @Override
    double calcArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
