package com.epam.hw4.task4;

import java.util.Scanner;

public class Main {
    static String result = "";


    public static void main(String[] args) {
        int number = input();
        while (check(number)) {
            System.out.println("Wrong input!");
            number = input();
        }
        createPyramid(number);
        out ();
    }
    static void  createPyramid (int number){
        for(int height = 1; height <= number+1; height++){
            for (int space = 0; space <= (number+1)-height; space++){
                result += " ";
            }
            for (int symbol = 1; symbol <= height; symbol++){
                result += symbol;
            }
            for (int symbolTwo = height-1; symbolTwo >= 1;symbolTwo--){
                result += symbolTwo;
            }
            result += "\n";
        }
    }
    static void out(){
        System.out.println("Result:" + "\n" + result);
    }
    static int input() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number (1..9): " + result);
        return scan.nextInt();
    }
    static boolean check(int number){
        if (number > 9 || number < 1){
            return true;
        }
        return false;
    }

}

