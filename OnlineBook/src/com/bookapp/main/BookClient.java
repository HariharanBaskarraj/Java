package com.bookapp.main;

import java.util.List;
import java.util.Scanner;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.*;
import com.bookapp.services.*;

public class BookClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookInterface bookImpl = new BookImplementation();

		Book book = null;
		for (int i = 0; i < 2; i++) {
			book = new Book();
			System.out.println("Enter Book title:");
			book.setTitle(sc.nextLine());
			System.out.println("Enter Book ID:");
			book.setBookID(sc.nextInt());
			sc.nextLine();
			System.out.println("Enter Author:");
			book.setAuthor(sc.nextLine());
			System.out.println("Enter Category:");
			book.setCategory(sc.nextLine());
			System.out.println("Enter Price:");
			book.setPrice(sc.nextDouble());
			sc.nextLine();
			bookImpl.addBook(book);
		}

		System.out.println(bookImpl.getAllBooks() + "\n");

		for (;;) {
			try {
				System.out.println("Enter the author to search");
				String author = sc.nextLine();
				List<Book> booksByAuthor = bookImpl.getBookbyAuthor(author);
				booksByAuthor.forEach(System.out::println);
			} catch (AuthorNotFoundException e) {
				System.out.println(e.getMessage() + "\n");
			}

			try {
				System.out.println("Enter the genre to search");
				String genre=sc.nextLine();
				List<Book> booksByCategory=bookImpl.getBookbyCategory(genre);
				booksByCategory.forEach(System.out::println);
			} catch (CategoryNotFoundException e) {
				System.out.println(e.getMessage() + "\n");
			}

			System.out.println("Continue??? Enter y");
			char status = Character.toUpperCase(sc.next().charAt(0));
			sc.nextLine();
			if (status != 'Y') {
				sc.close();
				System.exit(0);
			}
		}
	}
}
