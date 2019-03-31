package com.epam.task1;

public class Shape {
    String color;
    Shape (String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return  "class: "+ this.getClass().getSimpleName() + " | сolor: " + this.color;
    }

    double calcArea(){
        return 0;
    }
}
