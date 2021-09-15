package com.longs7.spingbootapi.rest;

import com.longs7.spingbootapi.entity.Book;
import com.longs7.spingbootapi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookRestController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    List<Book> getAllBook() {
        return bookService.findAllBook();
    }

    @GetMapping("/books/{id}")
    Book getBookById(@PathVariable("id") int id) {
        return bookService.getBookById(id);
    }

    @PostMapping("/books")
    void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @PutMapping("/books")
    void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    void deleteBook(@PathVariable("id") int id) {
        bookService.deleteBook(id);
    }
}
