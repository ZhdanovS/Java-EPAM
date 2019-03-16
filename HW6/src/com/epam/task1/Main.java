package com.epam.task1;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static Book book;

    public static void main(String[] args) {
        int sizeArray;
        Books books;
        int choice;
        int end = 1;
        System.out.print("Input size of array: ");
        sizeArray = scan.nextInt();
        books = new Books(sizeArray);
        while (end == 1) {
            System.out.println("1 - add book;");
            System.out.println("2 - change price");
            System.out.println("3 - search author");
            System.out.println("4 - search year;");
            System.out.println("5 - show array;");
            System.out.println("another number - exit.");
            System.out.print("Choice: ");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    recordBook(books, book);
                    break;
                case 2:
                    changePrice(books);
                    break;
                case 3:
                    searchAuthorBooks(books);
                    break;
                case 4:
                    searchYear(books);
                    break;
                case 5:
                    books.showArray();
                    break;
                default:
                    end = 0;
            }
        }
    }
    private static void recordBook (Books books, Book book){
        scan.nextLine();
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Author: ");
        String author = scan.nextLine();
        System.out.print("ID: ");
        int id = scan.nextInt();
        System.out.print("Year: ");
        int year = scan.nextInt();
        System.out.print("Number of pages: ");
        int numberOfPages = scan.nextInt();
        System.out.print("Price: ");
        float price = scan.nextFloat();

        book = new Book(id, name, author, year, numberOfPages, price);
        books.addBook(book);
        System.out.println("Done!");
    }
    private static void changePrice(Books books){
        int id;
        int choice;
        boolean plusOrNot;
        float percent;

        System.out.print("Enter ID your book: ");
        id = scan.nextInt();

        System.out.print("Enter 1 - if you want to raise price and enter any number if reduce: ");
        choice = scan.nextInt();
        plusOrNot = (choice == 1);
        System.out.print("Enter percent: ");
        percent = scan.nextInt();

        books.changePrice(percent, id, plusOrNot);
        }
    private static void searchAuthorBooks (Books books){
        String author;
        System.out.print("Enter author: ");
        scan.nextLine();
        author = scan.nextLine();
        books.searchAuthor(author);
        }
    private static void searchYear(Books books){
        int year;
        System.out.print("Enter year: ");
        year = scan.nextInt();
        books.searchYear(year);
    }

}
