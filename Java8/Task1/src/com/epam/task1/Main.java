package com.epam.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

	Integer[] myArr = new Integer [10];

	for (int i = 0; i < myArr.length; i++){
	    myArr[i] = (int)(Math.random()*100);
    }

	System.out.println("Given:  ");
	showArr(myArr);

	Arrays.sort(myArr, (o1, o2)-> {
	    if(o1.equals(o2)){
	        return 0;
        }
	    if (o1 > o2){
	        return -1;
        }
	    else {
	        return 1;
        }
    });

	System.out.println();
	System.out.println("Result of sorting: ");
		showArr(myArr);

	ArrayList<String> listik = new ArrayList<>();
	listik.add("Abc");
	listik.add("Bbc");
	listik.add("Ccc");
	listik.add("Bbb");
	listik.add("Aac");

	System.out.println();
		System.out.println("Given:");
		showList(listik);

		listik.sort((o1, o2)-> o1.compareTo(o2));

		System.out.println();
		System.out.println("Result of sorting: ");
		showList(listik);

    }
		static<T> void showArr (T[] arr) {
			for (T a : arr) {
				System.out.print(a + "; ");
			}
		}

		static  void showList (ArrayList<String> listik){
			for (String a : listik) {
				System.out.print(a + "; ");
			}
	}




}
