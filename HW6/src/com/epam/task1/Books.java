package com.epam.task1;

import java.util.Scanner;

public class Books {

    Book[] arrayBooks;

    Books(int sizeArray) {
        arrayBooks = new Book[sizeArray];
    }

    void addBook(Book book){
        for(int i = 0; i < arrayBooks.length; i++){
            if(arrayBooks[i] == null) {
                arrayBooks[i] = book;
                break;
            }
            else if (i == arrayBooks.length-1){
                System.out.println("Sorry, you have not space for new book!");
                break;
            }
        }
    }
    void showArray(){
        for(Book element : arrayBooks){
            if(element != null){
                outputBook(element);
            }
            else{
                System.out.println("You have space for new book!");
            }
        }
    }
    void changePrice(float percent, int id, boolean plusOrNot){
        for(int i = 0; i < arrayBooks.length; i++){
            if(arrayBooks[i].getId() == id){
                if(plusOrNot){
                    arrayBooks[i].setPrice(arrayBooks[i].getPrice()*((100+percent)/100));
                    System.out.println("Done!");
                    break;
                }
                else{
                    arrayBooks[i].setPrice(arrayBooks[i].getPrice()*((100-percent)/100));
                    System.out.println("Done!");
                    break;
                }
            }
            else if(arrayBooks[i] == null ){
                System.out.println("You haven't book with this ID");
                break;
            }
        }
    }
    void searchAuthor(String author){
        boolean find = false;
        for(Book element : arrayBooks){
            if(element != null && element.getAuthor().equals(author)) {
                find = true;
                System.out.println("Book with author \"" + author + "\": ");
                outputBook(element);
            }
            else if(!find && element == null){
                System.out.println("You haven't book with \"" + author + "\" !");
                break;
            }
            else if(!find && element == arrayBooks[arrayBooks.length-1]){
                System.out.println("You haven't book with \"" + author + "\" !");
                break;
            }

        }
    }
    void searchYear(int year){
        boolean find = false;
        for(Book element : arrayBooks){
            if(element != null && element.getYear() > year) {
                find = true;
                System.out.println("Book are published after " + year + ": ");
                outputBook(element);
            }
            else if(element == null && find == false){
                System.out.println("You haven't book are published after " + year + "!");
                break;
            }
            else if(find == false && element == arrayBooks[arrayBooks.length-1]){
                System.out.println("You haven't book are published after " + year + "!");
                break;
            }
        }
    }
    void outputBook(Book element){
        System.out.print("ID: " + element.getId() + " |");
        System.out.print(" Name: " + element.getName() + " |");
        System.out.print(" Author: " + element.getAuthor() + "|");
        System.out.print(" Year: " + element.getYear() + " |");
        System.out.print(" Number of pages: " + element.getNumberOfPages() + " |");
        System.out.println(" Price: " + element.getPrice());
    }


}
