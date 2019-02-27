package com.epam;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter task number (1, 2, 3 or 4):");
        int taskNumber = scan.nextInt();


        switch (taskNumber) {
            case 1: Task1();
                break;
            case 2: Task2();
                break;
            case 3: Task3();
                break;
            case 4: Task4();
                break;
            default: System.out.println("There are only 4 tasks here (1, 2, 3 or 4).");
                break;
        }

    }
    public static void Task1() {
        System.out.println("First task.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = scan.nextInt();
        System.out.print("Enter second number:");
        int number2 = scan.nextInt();

        number1 = (number1 + number2) - (number2 = number1);

        System.out.println("Look at this magic!" + "\n" + "Your first number: " + number1 + "\n" + "Your second number: " + number2);
    }
    public static void Task2() {
        System.out.println("Second task.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter three-valued integer:");
        int number = scan.nextInt();

        int units = number % 10;
        int tens =((number - units) % 100) / 10;
        int hundreds = ((number - tens) % 1000) / 100;
        int reverseNumber = units * 100 + tens * 10 + hundreds;

        System.out.println(number + "-" + reverseNumber + "=" + (number - reverseNumber));

    }
    public static void Task3() {
        System.out.println("Third task.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        double  pounds = scan.nextDouble();

        double kilos = pounds * 0.45359;
        double kilosOnly = (int) kilos;
        double gramsOnly = kilos - kilosOnly;

        System.out.println(pounds + " pounds -> " + "Kilos: "+ kilosOnly + " grams: " + gramsOnly);
    }
    public static void Task4() {
        System.out.println("Fourth task.");
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter deposit:");
        double deposit = scan.nextDouble();
        System.out.print("Enter months:");
        int months = scan.nextInt();
        System.out.print("Enter percentages:");
        double percentages = scan.nextDouble();

        double profit = (deposit * percentages * months)/ (100 * 12);

        System.out.println("Profit: " + profit);



    }
}
