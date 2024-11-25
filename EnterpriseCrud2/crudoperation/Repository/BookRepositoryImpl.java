package com.xworks.crudoperation.Repository;

import com.xworks.crudoperation.Entity.Book;

public class BookRepositoryImpl implements BookRepository {

    Book[] books = new Book[10];

    @Override
    public boolean saveBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book has been saved.");
                return true;
            }
        }
        System.err.println("No space available to store the book.");
        return false;
    }

    @Override
    public Book[] readAll() {
        return books;
    }

    @Override
    public Book findByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                System.out.println("Book found.");
                return books[i];
            }
        }
        System.err.println("Book not found.");
        return null;
    }

    @Override
    public boolean updatePriceByTitle(String title, double price) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i].setPrice(price);
                System.out.println("Price updated successfully.");
                return true;
            }
        }
        System.err.println("Book not found.");
        return false;
    }

    @Override
    public boolean deleteByTitle(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                books[i] = null;
                System.out.println("Book deleted successfully.");
                return true;
            }
        }
        System.err.println("Book not found.");
        return false;
    }

    @Override
    public Book findByGenre(String genre) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getGenre().equals(genre)) {
                System.out.println("Book found.");
                return books[i];
            }
        }
        System.err.println("Book not found.");
        return null;
    }

    @Override
    public boolean updatePriceByGenre(String genre, double price) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getGenre().equals(genre)) {
                books[i].setPrice(price);
                System.out.println("Price updated successfully.");
                return true;
            }
        }
        System.err.println("Book not found.");
        return false;
    }

    @Override
    public boolean deleteByGenre(String genre) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getGenre().equals(genre)) {
                books[i] = null;
                System.out.println("Book deleted successfully.");
                return true;
            }
        }
        System.err.println("Book not found.");
        return false;
    }

	@Override
	public boolean saveBook1(Book book) {
		// TODO Auto-generated method stub
		return false;
	}
}
