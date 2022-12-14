package com.bookapp.dao;

import java.util.List;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.*;

public interface BookInter {

	void addBook(Book book);

	boolean deleteBook(int bookid) throws BookNotFoundException;

	Book getBookById(int bookid) throws BookNotFoundException;

	boolean updateBook(int bookid, double price) throws BookNotFoundException;

	List<Book> getAllBooks() throws BookNotFoundException;

	List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException;

	List<Book> getBookbyCategory(String category) throws CategoryNotFoundException;
}
