package com.lhalcyon.webhook.service;

import com.lhalcyon.webhook.domain.Book;

import java.util.List;

/**
 * Created by ceyx on 2018-1-31.
 */
public interface BookService {

    void insertBook(Book book);

    void updateBook(Book book);

    List<Book> getAllBooks();

    void deleteBookById(int bookId);
}
