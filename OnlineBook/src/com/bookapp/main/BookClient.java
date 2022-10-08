package com.bookapp.main;

import java.util.Scanner;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.*;
import com.bookapp.services.*;

public class BookClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookInterface bookImpl = new BookImplementation();

		Book book = null;
		System.out.println("Enter the number of books to add: ");
		int count =sc.nextInt();sc.nextLine();
		System.out.println("Enter book details to add...");
		for (int i = 0; i < count; i++) {
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
			System.out.println("Book "+(i+1)+" added...\n");
		}

		System.out.println("Getting all the books: ");
		bookImpl.getAllBooks().forEach(System.out::println);

		for (;;) {
			System.out.println("\nGetting books by author: ");
			try {
				System.out.println("Enter the author to search");
				String author = sc.nextLine();
				bookImpl.getBookbyAuthor(author).forEach(System.out::println);
			} catch (AuthorNotFoundException e) {
				System.out.println(e.getMessage() + "\n");
			}

			System.out.println("Getting books by genre: ");
			try {
				System.out.println("Enter the genre to search");
				String genre=sc.nextLine();
				bookImpl.getBookbyCategory(genre).forEach(System.out::println);
				System.out.println();
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
