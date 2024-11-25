package com.xworks.crudoperation.Services;

import com.xworks.crudoperation.Entity.Book;

public interface BookServices {

    boolean validateBook(Book book);

    Book[] readAll();

    Book findByTitle(String title);

    boolean updatePriceByTitle(String title, double price);

    boolean deleteByTitle(String title);

    Book findByGenre(String genre);

    boolean updatePriceByGenre(String genre, double price);

    boolean deleteByGenre(String genre);
}
