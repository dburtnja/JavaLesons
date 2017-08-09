package com.example.demo.dao;

import com.example.demo.model.Book;

import java.util.List;

public interface BookDAO {

    void        addBook(Book book);

    void        updateBook(Book book);

    void        removeBook(int id);

    Book        getBookById(int id);

    List<Book>  listBooks();
}
