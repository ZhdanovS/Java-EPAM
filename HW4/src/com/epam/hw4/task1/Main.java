package com.epam.hw4.task1;

import java.util.Scanner;

public class Main {
    static String result = "";

    public static void main(String[] args) {
        String str = input();
        getUniqueCharacters(str);
        output ();
    }
    static void  getUniqueCharacters (String str){ //Space is character!
        for (int recorded = 0; recorded < str.length(); recorded++ ){
            result = result + str.charAt(recorded);
            for (int checking = recorded+1; checking  < str.length(); checking++){
                if(str.charAt(recorded) == str.charAt(checking)){
                    str = str.substring(0,checking) + str.substring(checking+1);
                    checking--;
                }
            }

        }
    }
    static void output (){
        System.out.println("result = " + result);
    }
    static String input () {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter: ");
        return scan.nextLine();
    }

}
