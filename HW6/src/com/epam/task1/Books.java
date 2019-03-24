package com.epam.task1;

public class Books {

    private Book[] arrayBooks;

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
                element.view();
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
    Books searchAuthor(String author){

        int size = calculateSize(author);

        if(size==0){
            System.out.println("You have not book with this author!");
            return null;
        }
        Books array = new Books(size);
        for(Book element : arrayBooks){
            if(element != null && author.equals(element.getAuthor())){
                array.addBook(element);
            }
        }
        return array;
    }
    Books searchYear(int year){
        int size = calculateSize( year);
        for(Book element : arrayBooks){
            if (element != null && year < element.getYear()){
                size++;
            }
        }
        if(size==0){
            System.out.println("You have not book published after " + year + "!");
            return null;
        }
        Books array = new Books(size);
        for(Book element : arrayBooks){
            if(element != null && year < element.getYear()){
                array.addBook(element);
            }
        }
        return array;
    }
    private int calculateSize(int year){
        int size = 0;
        for(Book element : arrayBooks){
            if (element != null && year < element.getYear()){
                size++;
            }
        }
        return size;
    }
    private int calculateSize(String author){
        int size = 0;
        for(Book element : arrayBooks){
            if(element != null && author.equals(element.getAuthor())){
                size++;
            }
        }
        return size;
    }
}
