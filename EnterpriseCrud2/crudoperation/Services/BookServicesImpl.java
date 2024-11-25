package com.xworks.crudoperation.Services;

import com.xworks.crudoperation.Entity.Book;
import com.xworks.crudoperation.Repository.BookRepository;
import com.xworks.crudoperation.Repository.BookRepositoryImpl;

public class BookServicesImpl implements BookServices {

    BookRepository repo = new BookRepositoryImpl();

    @Override
    public boolean validateBook(Book book) {
        if (book != null) {
            if (book.getTitle() != null && book.getTitle().length() > 3) {
                if (book.getGenre() != null && book.getGenre().length() > 3) {
                    if (book.getPrice() > 50) {
                        if (book.getPages() > 0) {
                            System.out.println("Validation Successful. No Error!!");
                            return repo.saveBook(book);
                        }
                        System.err.println("Pages should be greater than 0!");
                        return false;
                    }
                    System.err.println("Price should be greater than 50!");
                    return false;
                }
                System.err.println("Genre should contain a minimum of 3 characters!");
                return false;
            }
            System.err.println("Title should contain a minimum of 3 characters!");
            return false;
        }
        System.err.println("Values cannot be null!");
        return false;
    }

    @Override
    public Book[] readAll() {
        return repo.readAll();
    }

    @Override
    public Book findByTitle(String title) {
        if (title != null && !title.isEmpty()) {
            System.out.println("Input is valid.");
            return repo.findByTitle(title);
        }
        System.err.println("Input is not valid!");
        return null;
    }

    @Override
    public boolean updatePriceByTitle(String title, double price) {
        if (title != null && !title.isEmpty()) {
            if (price > 50) {
                return repo.updatePriceByTitle(title, price);
            }
            System.err.println("Price should be greater than 50!");
            return false;
        }
        System.err.println("Invalid input!");
        return false;
    }

    @Override
    public boolean deleteByTitle(String title) {
        if (title != null && !title.isEmpty()) {
            System.out.println("Validation successful.");
            return repo.deleteByTitle(title);
        }
        System.err.println("Invalid input!");
        return false;
    }

    @Override
    public Book findByGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            System.out.println("Input is valid.");
            return repo.findByGenre(genre);
        }
        System.err.println("Input is not valid!");
        return null;
    }

    @Override
    public boolean updatePriceByGenre(String genre, double price) {
        if (genre != null && !genre.isEmpty()) {
            if (price > 50) {
                return repo.updatePriceByGenre(genre, price);
            }
            System.err.println("Price should be greater than 50!");
            return false;
        }
        System.err.println("Invalid input!");
        return false;
    }

    @Override
    public boolean deleteByGenre(String genre) {
        if (genre != null && !genre.isEmpty()) {
            System.out.println("Validation successful.");
            return repo.deleteByGenre(genre);
        }
        System.err.println("Invalid input!");
        return false;
    }
}

