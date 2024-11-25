package com.xworks.crudoperation.Entity;

public class Book {

    private String title;
    private String author;
    private String genre;
    private double price;
    private int stock;

    public Book(String title, String author, String genre, double price, int stock) {
        super();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void printDetails() {
        System.out.println("--------------------------------------");
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Stock Available: " + stock);
    }

	public int getPages() {
		// TODO Auto-generated method stub
		return 0;
	}
}
