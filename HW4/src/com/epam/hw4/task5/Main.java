package com.epam.hw4.task5;

import java.util.Scanner;

public class Main {
    static String result = "";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.nextLine();
        System.out.print("Enter word number: ");
        int number = scan.nextInt();
        getCharacter(str, number);
        output ();
    }
    static void  getCharacter (String str, int number){
        int space = 0;
        str = " " + str;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                space++;
                if(space == number) {
                    result += str.charAt(i+1);
                    break;
                }
            }
        }
    }

    static void output (){
        System.out.println("First letter your word: " + result);
    }


}

