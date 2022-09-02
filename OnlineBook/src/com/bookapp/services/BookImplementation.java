package com.bookapp.services;

import java.util.*;
import java.util.stream.Collectors;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.*;

public class BookImplementation implements BookInterface {

	public List<Book> bookList = new ArrayList<Book>();
	
	@Override
	public void addBook(Book book) {
		bookList.add(book);
	}

	@Override
	public List<Book> getAllBooks() {
		Collections.sort(bookList, (book1, book2) -> {
			return book1.getTitle().compareTo(book2.getTitle());
		});
		return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		List<Book> authorList = new ArrayList<>();
		for (Book book : bookList) {
			if (book.getAuthor().equals(author)) {
				authorList.add(book);
			}
		}
		
		if(authorList.size()==0) {
			throw new AuthorNotFoundException("The given author is not found");
		}
		return authorList;
	}
//
//	Predicate<String> pred = (str)->str.equals("hello")
//	Predicate<Book> pred = (book)->book.getCatgeory().equals("tech") 		
//	pred.test(bookobj);
	@Override
	public List<Book> getBookbyCategory(String category) throws CategoryNotFoundException {
		List<Book> categoryList =bookList.stream()
				.filter(book->book.getCategory().equals(category))
				.collect(Collectors.toList());
		
		if(categoryList.isEmpty()) {
			throw new CategoryNotFoundException("The given category is not found");
		}
		return categoryList;
	}

}
