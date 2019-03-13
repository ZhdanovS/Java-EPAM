package com.epam.task6;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.print("Enter (first array): ");
        int sizeArray1 = input();
        System.out.print("Enter (second array): ");
        int sizeArray2 = input();
        int[] array1 = new int[sizeArray1];
        int[] array2 = new int[sizeArray2];
        int[] array3 = new int[sizeArray1 + sizeArray2];
        fillArray(array1);
        fillArray(array2);
        fillArray3(array1, array2, array3);
        output(array1, array2, array3);
    }
    public static int input(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
    public static void fillArray(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 100);
        }
    }
    public static void fillArray3(int[] array1, int[] array2, int[] array3){
        for(int i = 0; i < (array3.length - array2.length); i++){
            array3[i] = array1[i];
        }
        for(int i = array1.length; i < array3.length; i++){
            array3[i] = array2[i-array1.length];
        }
    }
    public  static void output(int[] array1, int[] array2, int[] array3){
        System.out.println("first array" + Arrays.toString(array1));
        System.out.println("second array" + Arrays.toString(array2));
        System.out.println("third array" + Arrays.toString(array3));
    }
}
