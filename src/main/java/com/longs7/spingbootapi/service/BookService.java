package com.longs7.spingbootapi.service;

import com.longs7.spingbootapi.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAllBook();
    Book getBookById(int id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(int id);

}
