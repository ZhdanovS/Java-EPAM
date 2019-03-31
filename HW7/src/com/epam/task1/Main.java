package com.epam.task1;

import sun.plugin.javascript.navig.Array;
import java.util.Arrays;

public class Main {
    private static Shape [] array = new Shape[9];

    public static void main(String[] args) {


	array[0] = new Triangle("white",1,2,2 );
    array[1] = new Triangle("green",2,2,2 );
    array[2] = new Triangle("black",3,4,5 );
    array[3] = new Triangle("blue",1,3,3 );

    array[4] = new Circle("red",10);
    array[5] = new Circle("yellow",11 );
    array[6] = new Circle("blue",12);

    array[7] = new Rectangle("green",21,22 );
    array[8] = new Rectangle("white",24,25 );

    printArrayOfAreaElements();
    System.out.println();
    printArray ();
    System.out.println();
    System.out.println("All area: " + calculateAllArea());
    System.out.println();
    printAreaOfTypes(calculateAreaOfTypes());
    }

    private static void printArrayOfAreaElements (){
        for(Shape element: array){
            System.out.print(element.getClass().getSimpleName());
            System.out.println(" Area: " + element.calcArea());
        }
    }
    private static void printArray (){
        for(Shape element: array){
            System.out.println(element.toString());

        }
    }

    private static double calculateAllArea (){
        double sum = 0;
        for(Shape element: array){
            sum += element.calcArea();
        }
        return sum;
    }

    static double[] calculateAreaOfTypes(){
        double[] areaOfTypes = new double[3];

        for(Shape element: array){
            if (element instanceof Triangle){
                areaOfTypes[0] += element.calcArea();
            }
            else if (element instanceof Circle){
                areaOfTypes[1] += element.calcArea();
            }
            else if (element instanceof Rectangle){
                areaOfTypes[2] += element.calcArea();
            }

        }

        return areaOfTypes;
    }
    private static void printAreaOfTypes(double[] areaOfTypes){
        System.out.println("Area rectangles: " + areaOfTypes[2]);
        System.out.println("Area circles: " + areaOfTypes[1]);
        System.out.println("Area triangles: " + areaOfTypes[0]);
    }

}
