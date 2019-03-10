package com.epam.hw4.task3;

import java.util.Scanner;

public class Main {
    static String result = "";

    public static void main(String[] args) {
        int number = input();
        while (check(number)) {
            System.out.println("Wrong input!");
            number = input();
        }
        createString(number);
        out ();
    }
    static void  createString (int number){
        int lastNumber = number % 10;
        int preLastNumber = (number - lastNumber)/10 % 10;
        result = result + lastNumber + preLastNumber;
    }
    static void out (){
        System.out.println("Result = " + result);
    }
    static int input () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number(32767..-10 or 10..-32768: " + result);
        return scan.nextInt();
    }
    static boolean check(int number){
        if (number > 32767 || number < -32768 || (number > -10 && number < 10)){
            return true;
        }
        return false;
    }

}
