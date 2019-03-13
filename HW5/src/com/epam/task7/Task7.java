package com.epam.task7;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array = new int[sizeArray];
        fillArray(array);
        int max = calculateMax(array);
        int min = calculateMin(array);
        int sizeArray1 = calculateSize(array, min, max);
        int[] array1 = new int[sizeArray1];
        fillArray1(array, array1, min, max);
        output(array, array1, min, max);

    }

    public static boolean check(int size){
        if (size <= 2 || size > 50){
            return false;
        }
        else {
            return true;
        }
    }
    private static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10);
        }
    }
    private static int inputSize(){
        System.out.print("Enter size of array(2..50): ");
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    private static int calculateSize(int[] array, int min, int max){
       int size = 2;
       if (min == max){
           return 1;
       }
       for(int i = 0; i < array.length; i++){
           if(array[i] != min && array[i] != max){
               size++;
           }
       }
        return size;
   }
    private static int calculateMin(int[] array){
        int min = array[0];
       for(int i = 1; i < array.length; i++){
           if (min > array[i]){
               min = array[i];
           }
       }
        return min;
   }
    private static int calculateMax(int[] array) {
        int max = 0;
       for(int i = 1; i < array.length; i++){
           if (max < array[i]){
               max = array[i];
           }
       }
        return max;
   }
    private static void fillArray1(int[] array, int[] array1, int min, int max){
       int duplicate = 0;
       array1[0] = min;
       array1[1] = max;
       for(int i = 0; i < array.length; i++){
           if(array[i] != min && array[i] != max){
               array1[i+2-duplicate] = array[i];
           }
           else{
               duplicate++;
           }
       }
   }
    private static void output(int[] array, int[] array1, int min, int max) {
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Your array without repeating the minimum and maximum values: " + Arrays.toString(array1));
    }
}
