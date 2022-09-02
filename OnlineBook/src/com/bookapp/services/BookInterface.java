package com.bookapp.services;

import java.util.List;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.AuthorNotFoundException;
import com.bookapp.exceptions.CategoryNotFoundException;

public interface BookInterface {

	void addBook(Book book);

	List<Book> getAllBooks();

	List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException;

	List<Book> getBookbyCategory(String category) throws CategoryNotFoundException;

}
