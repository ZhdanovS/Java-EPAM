package com.epam.hw4.task2;

import java.util.Scanner;

public class Main {
    static String result = "";

    public static void main(String[] args) {
        int number = input();
        draw(number);
        out ();
    }
    static void  draw (int number){
        int bit;
        int divided = number;
        if (number < 0){
            divided *= -1;
        }
        do {
            bit = divided % 2;
            result =  bit + result;
            divided /=2;
        }
        while (divided != 0);
        if (number < 0){
            result = "-" + result;
        }
    }
    static void out (){
        System.out.println("Result = " + result);
    }
    static int input () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: " + result);
        return scan.nextInt();
    }

}
