package com.epam.task1.controller;

import com.epam.task1.model.Books;
import com.epam.task1.model.Book;
import com.epam.task1.view.ViewBooks;


public class ControllerBooks {
    private ViewBooks view = new ViewBooks();
    private Books books;

    public void run(){


        int choice;
        int end = 1;
        System.out.print("Input size of array: ");

        books = new Books(InputUtil.inputInt());
        while (end == 1) {
            view.print(" - * * * * * * -Menu- * * * * * * - " + "\n");
            view.print("1 - add book;" + "\n");
            view.print("2 - change price" + "\n");
            view.print("3 - search author" + "\n");
            view.print("4 - search year;" + "\n");
            view.print("5 - show array;" + "\n");
            view.print("another number - exit." + "\n");
            view.print(" - * * * * * * ------ * * * * * * - " + "\n");
            view.print("Choice: ");
            choice = InputUtil.inputInt();
            switch (choice) {
                case 1:
                    recordBook();
                    break;
                case 2:
                    changePrice();
                    break;
                case 3:
                    searchAuthorBooks();
                    break;
                case 4:
                    searchYear();
                    break;
                case 5:
                    view.print(books.showArray());
                    break;
                default:
                    end = 0;
            }
        }
    }

    private void recordBook (){
        InputUtil.inputString();
        view.print("Name: ");
        String name = InputUtil.inputString();
        view.print("Author: ");
        String author = InputUtil.inputString();
        view.print("ID: ");
        int id = InputUtil.inputInt();
        view.print("Year: ");
        int year = InputUtil.inputInt();
        view.print("Number of pages: ");
        int numberOfPages = InputUtil.inputInt();
        view.print("Price: ");
        float price = InputUtil.inputFloat();

        if(!books.addBook(new Book(id, name, author, year, numberOfPages, price))){
            view.print("Library is full!" + "\n");
        }
        else {
            view.print("Done!" + "\n");
        }
    }
    private void changePrice(){
        view.print("Enter percent: ");
        float percent = InputUtil.inputFloat();
        books.changePrice(percent);
    }
    private void searchAuthorBooks(){
        view.print("Enter author: ");
        InputUtil.inputString();
        String author = InputUtil.inputString();
        view.print(books.find(author).showArray());
    }
    private void searchYear(){
        view.print("Enter year: ");
        int year = InputUtil.inputInt();
        view.print(books.find(year).showArray());
    }
}
