package com.epam.task5;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array = new int[sizeArray];
        fillArray(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Avarage: " + calculateAvarage(array));
        System.out.println("Number of element which bigger than avarage: " + calculateNumber(array,calculateAvarage(array)));

    }
    private static int inputSize(){
        System.out.print("Enter size of array(1..20): ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
    }
    private static double calculateAvarage(int[] array){
        double avarage;
        double sum = 0;
        for (int i = 0; i <= array.length-1; i++){
            sum+=array[i];
        }
        avarage = sum / (array.length);
        return avarage;
    }
    private static int calculateNumber(int[] array, double avarage){
        int number = 0;
        for (int i = 0; i <= array.length-1; i++){
            if(array[i] > avarage) {
                number++;
            }
        }
        return number;
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
