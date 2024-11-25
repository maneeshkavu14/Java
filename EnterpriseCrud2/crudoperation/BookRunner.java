package com.xworks.crudoperation;

import com.xworks.crudoperation.Entity.Book;
import com.xworks.crudoperation.Services.BookServices;
import com.xworks.crudoperation.Services.BookServicesImpl;

public class BookRunner {
    public static void main(String[] args) {
        
        BookServices library = new BookServicesImpl();
        
        // Adding books to the library
        Book book1 = new Book("The Alchemist", "Fiction","Manish", 300, 250);
        Book book2 = new Book("Sapiens", "History","Anish", 500, 412);
        Book book3 = new Book("Clean Code", "Programming","Athul", 600, 432);
        Book book4 = new Book("Atomic Habits", "Self-Help","Sumanth", 450, 320);
        
        library.validateBook(book1);
        library.validateBook(book2);
        library.validateBook(book3);
        library.validateBook(book4);
        
        // Finding a book by title
        Book foundBook = library.findByTitle("Clean Code");
        if (foundBook != null) {
            foundBook.printDetails();
        }
        
        // Reading all books before update
        Book[] allBooks = library.readAll();
        System.out.println("================== Before Update ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
        
        // Updating the price of a book by title
        library.updatePriceByTitle("The Alchemist", 350);
        
        // Reading all books after update
        System.out.println("================== After Update ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
        
        // Deleting a book by title
        library.deleteByTitle("Sapiens");
        
        // Reading all books after deletion
        System.out.println("================== After Deletion ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
        
        System.out.println("***************\nFind, Update, and Delete using Genre\n******************");
        
        // Finding a book by genre
        Book foundGenreBook = library.findByGenre("Fiction");
        if (foundGenreBook != null) {
            foundGenreBook.printDetails();
        }
        
        // Reading all books before genre update
        System.out.println("================== Before Update by Genre ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
        
        // Updating price by genre
        library.updatePriceByGenre("Fiction", 400);
        
        // Reading all books after genre update
        System.out.println("================== After Update by Genre ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
        
        // Deleting books by genre
        library.deleteByGenre("Fiction");
        
        // Reading all books after deleting by genre
        System.out.println("================== After Deletion by Genre ==================");
        for (Book book : allBooks) {
            if (book != null) {
                book.printDetails();
            }
        }
    }
}
