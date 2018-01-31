package com.lhalcyon.webhook.domain;

public class Book {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.book_id
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    private Integer bookId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.book_name
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    private String bookName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    private String author;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.book_id
     *
     * @return the value of book.book_id
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.book_id
     *
     * @param bookId the value for book.book_id
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.book_name
     *
     * @return the value of book.book_name
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.book_name
     *
     * @param bookName the value for book.book_name
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public String getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbggenerated Wed Jan 31 14:44:01 CST 2018
     */
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}