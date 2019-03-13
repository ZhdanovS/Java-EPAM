package com.epam.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array = new int[sizeArray];
        fillArray(array);
        int[]arrayNegative = new int[calculateNumberNegative(array)];
        int[]arrayPositive = new int[sizeArray-calculateNumberNegative(array)];
        fillResultArrays (arrayNegative, arrayPositive, array);
        outputArrays(arrayNegative, arrayPositive, array);
    }
    private static int inputSize(){
        System.out.print("Enter size of array(1..20): ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (-100) + (int)(Math.random() * 200);
        }
    }
    private static void outputArrays(int[]arrayNegative, int[] arrayPositive, int[] array) {
        System.out.print("Your array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Positive array: " + Arrays.toString(arrayPositive));
        System.out.println("Negative array: " + Arrays.toString(arrayNegative));
    }
    private static int calculateNumberNegative(int[] array) {
        int number = 0;
        for (int element : array){
            if (element < 0){
                number++;
            }
        }
        return number;
    }
    private static void fillResultArrays (int[]arrayNegative, int[] arrayPositive, int[] array ){
        int indexNegative = 0;
        int indexPositive = 0;
        for(int element : array){
            if(element < 0){
                arrayNegative[indexNegative] = element;
                indexNegative++;
            }
            else {
                arrayPositive[indexPositive] = element;
                indexPositive++;
            }
        }
    }
    public static boolean check(int size){
        if (size <= 1 || size > 20){
            return false;
        }
        else {
            return true;
        }
    }


}

