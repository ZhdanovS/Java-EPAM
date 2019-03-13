package com.epam.task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array1 = new int[sizeArray];
        int[] array2 = new int[sizeArray];
        int[] array3 = new int[sizeArray];

        fillArray(array1, array2);
        calculateArray3(array1, array2, array3);
        output(array1, array2, array3);
    }
    private static int inputSize(){
        System.out.print("Enter size of array(1..20): ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static void fillArray(int[] array1, int[] array2){
        for(int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 100);
            array2[i] = (int)(Math.random() * 100);
        }
    }
    public static void calculateArray3(int[] array1, int[] array2, int[] array3) {
        for (int i = 0; i <= array3.length-1; i++){
            array3[i] = array1[i] + array2[i];
        }
    }
    private static void output(int[] array1, int[] array2, int[] array3) {
        System.out.println("First array: " + Arrays.toString(array1));
        System.out.println("Second array: " + Arrays.toString(array2));
        System.out.println("Third array: " + Arrays.toString(array3));
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
