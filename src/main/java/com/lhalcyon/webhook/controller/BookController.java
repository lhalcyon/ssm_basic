package com.lhalcyon.webhook.controller;

import com.lhalcyon.webhook.domain.Book;
import com.lhalcyon.webhook.domain.BookExample;
import com.lhalcyon.webhook.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ceyx on 2018-1-31.
 */
@RestController
public class BookController {

    private static final  Logger logger = Logger.getLogger(BookController.class);

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    public String insert(String bookName,String author){
        Book book = new Book();
        book.setBookName(bookName);
        book.setAuthor(author);
        bookService.insertBook(book);

        return queryStrings();
    }

    @RequestMapping("/update")
    public String updateAuthor(int bookId,String bookName,String author){

        Book book = new Book();
        book.setBookId(bookId);
        book.setBookName(bookName);
        book.setAuthor(author);
        bookService.updateBook(book);

        return queryStrings();
    }

    @RequestMapping("/delete")
    public String deleteBook(int bookId){
        bookService.deleteBookById(bookId);
        return queryStrings();
    }

    @RequestMapping("/find_all")
    public String getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        logger.info(books);

        return books.toString();
    }

    private String queryStrings(){
        List<Book> allBooks = bookService.getAllBooks();
        return allBooks.toString();
    }

}
