package com.epam.task1;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int sizeArray = inputSize();
        while (!check(sizeArray)) {
            sizeArray = inputSize();
        }
        int[] array = new int[sizeArray];
        fillArray(array);
        outputArrays(array);
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
    private static void outputArrays(int[] massif) {
        System.out.print("Your array: ");
        System.out.println(Arrays.toString(massif));
        System.out.print("Reverse array: ");
        System.out.print("[");
        for (int i = massif.length-1; i >= 0; i-- ){
            System.out.print(massif[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.print("]");
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
