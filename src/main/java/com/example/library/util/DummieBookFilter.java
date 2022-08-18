package com.example.library.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

@Component
public class DummieBookFilter {
    private final BookService bookService;

    public DummieBookFilter(BookService bookService)
    {
        this.bookService = bookService;
    }
    
    @PostConstruct
    public void init()
    {
        bookService.addBook(new Book(null, "El amor en los tiempos del colera", "Narrativo - Novela Romántica", "Gabriel Garcia Márquez", 500, 2));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "El Hobbit", "Precuela El señor de los anillos", "J.R.R Tolkien", 400, 3));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "The Martian", "Novela ciencia ficción", "Andy Weir", 350, 6));
        try {Thread.sleep(100);} catch (InterruptedException e) {}
        bookService.addBook(new Book(null, "Kafka en la orilla", "Novela-Ficción literaria", "Haruki Murakami", 450, 9));
    }
}
