package com.epam.task1;

public class Book {
    private int id;
    private String name;
    private String author;
    private int year;
    private int numberOfPages;
    private float price;

    public Book(int id, String name, String author, int year, int numberOfPages, float price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public void view(){
        System.out.print("ID: " + id + " |");
        System.out.print(" Name: " + name + " |");
        System.out.print(" Author: " + author + " |");
        System.out.print(" Year: " + year + " |");
        System.out.print(" Number of pages: " + numberOfPages + " |");
        System.out.println(" Price: " + price);
    }
}

