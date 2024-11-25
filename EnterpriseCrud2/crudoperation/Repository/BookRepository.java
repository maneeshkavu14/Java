package com.xworks.crudoperation.Repository;


import com.xworks.crudoperation.Entity.Book;

public interface BookRepository {

    boolean saveBook1(Book book);

    Book[] readAll();
    Book findByTitle(String title);
    boolean updatePriceByTitle(String title, double price);
    boolean deleteByTitle(String title);
    Book findByGenre(String genre);
    boolean updatePriceByGenre(String genre, double price);
    boolean deleteByGenre(String genre);

	boolean saveBook(com.xworks.crudoperation.Entity.Book book);
}
