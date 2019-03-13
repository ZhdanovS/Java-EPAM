package com.epam.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array = new int[sizeArray];
        fillArray(array);
        output(array);
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
    private static void output(int[] array) {
        System.out.print("Your array: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Number of odd elements: " + calculateNumber(array));
        System.out.println("Sum of odd elements: " + calculateSum(array));
    }

    public static int calculateNumber(int[] array) {
        int number = 0;
        for (int i = 1; i < array.length; i++){
            if(array[i] % 2 == 1){
                number++;
            }
        }
        return number;
    }
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] % 2 == 1){
                sum+=array[i];
            }
        }
        return sum;
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
