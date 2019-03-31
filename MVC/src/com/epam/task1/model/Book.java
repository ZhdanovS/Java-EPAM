package com.epam.task1.model;

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

    public String view(){
        return  "ID: " + id + " |" +
                " Name: " + name + " |" +
                " Author: " + author + " |" +
                " Year: " + year + " |" +
                " Number of pages: " + numberOfPages + " |" +
                " Price: " + price +
                "\n";
    }
    public void changePrice(float percent){
        price = price + price * (percent/100);
    }
}
