package com.lhalcyon.webhook.service.impl;

import com.lhalcyon.webhook.domain.Book;
import com.lhalcyon.webhook.domain.BookExample;
import com.lhalcyon.webhook.mapper.BookMapper;
import com.lhalcyon.webhook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ceyx on 2018-1-31.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;


    @Override
    public void insertBook(Book book) {
        bookMapper.insert(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateByPrimaryKey(book);
    }



    @Override
    public List<Book> getAllBooks() {
        BookExample example = new BookExample();
        return bookMapper.selectByExample(example);
    }

    @Override
    public void deleteBookById(int bookId) {
        BookExample example = new BookExample();
        example.createCriteria().andBookIdEqualTo(bookId);
        bookMapper.deleteByExample(example);
    }
}
