package com.epam.task1.model;

public class Books {
    private Book[] arrayBooks;
    private int postLastBook = 0;

    public Books(int sizeArray) {
        arrayBooks = new Book[sizeArray];
    }
    public boolean addBook (Book book){
        if (postLastBook >= arrayBooks.length){
            return false;
        }
        arrayBooks[postLastBook] = book;
        postLastBook++;
        return true;
    }
    public String showArray(){
        if (postLastBook == 0){
            return "Your library is empty" + "\n";
        }
        String books = "";
        for(int i = 0; i < postLastBook; i++){
            books += arrayBooks[i].view();
        }
        return books;
    }
    public void changePrice (float percent){
        for(int i=0; i<postLastBook; i++) {
            arrayBooks[i].changePrice(percent);
        }
    }
    private int calculateSize(int year){
        int size = 0;
        for(int i = 0; i < postLastBook; i++){
            if ( year < arrayBooks[i].getYear()){
                size++;
            }
        }
        return size;
    }
    private int calculateSize(String author){
        int size = 0;
        for(int i = 0; i < postLastBook; i++){
            if(arrayBooks[i] != null && author.equals(arrayBooks[i].getAuthor())){
                size++;
            }
        }
        return size;
    }
    public Books find (String author){
        Books array = new Books(calculateSize(author));
        for(int i = 0; i < postLastBook; i++){
            if(author.equals(arrayBooks[i].getAuthor())){
                array.addBook(arrayBooks[i]);
            }
        }
        return array;
    }
    public Books find (int year){
        Books array = new Books(calculateSize(year));
        for(int i = 0; i < postLastBook; i++){
            if(year < arrayBooks[i].getYear()){
                array.addBook(arrayBooks[i]);
            }
        }
        return array;
    }

}
