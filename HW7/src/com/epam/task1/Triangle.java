package com.epam.task1;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    Triangle(String color, double a, double b, double c){
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public String toString(){
        return  "class: "+ this.getClass().getSimpleName() + " | color: " + this.color + " | a: " + this.a + " | b: " + this.b + " | c: " + this.c;
    }

    @Override
    double calcArea(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
