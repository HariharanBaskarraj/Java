package com.bookapp.main;

import java.util.*;
import com.bookapp.bean.Book;
import com.bookapp.dao.*;
import com.bookapp.exceptions.*;

public class BookClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookInter bookInter = new BookImpl();
		Book book = null;

		for (;;) {
			System.out.println("Enter the choice based on this menu: \n1)Add Book \n2)Delete Book "
					+ "\n3)Get book by ID \n4)Update Book \n5)Get All Books \n6)Get Book by Author "
					+ "\n7)Get Book by Category");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				System.out.println("Adding books...\nEnter the number of books to add: ");
				int count = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < count; i++) {
					book = new Book();
					System.out.println("Enter Title, Author, Book ID, Category, Price: ");
					try {
						String title = sc.nextLine();
						book.setTitle(title);
						String author = sc.nextLine();
						book.setAuthor(author);
						int bookId = sc.nextInt();
						sc.nextLine();
						book.setBookID(bookId);
						String category = sc.nextLine();
						book.setCategory(category);
						double price = sc.nextDouble();
						sc.nextLine();
						book.setPrice(price);
						bookInter.addBook(book);
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 2:
				System.out.println("Deleting the books...\nEnter the number of books to delete");
				count = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < count; i++) {
					try {
						System.out.println("Enter the book id to delete: ");
						int bookID = sc.nextInt();
						sc.nextLine();
						bookInter.deleteBook(bookID);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 3:
				System.out.println("Getting the book details by bookID...\nEnter the number of books to search: ");
				count = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < count; i++) {
					try {
						System.out.println("Enter the book id to get the book details: ");
						int bookID = sc.nextInt();
						sc.nextLine();
						System.out.println(bookInter.getBookById(bookID));
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 4:
				System.out.println("Updating the book details...\nEnter the number of books to update: ");
				count = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < count; i++) {
					try {
						System.out.println("Enter the book id and price to update the book price: ");
						int bookID = sc.nextInt();
						sc.nextLine();
						double price = sc.nextDouble();
						sc.nextLine();
						bookInter.updateBook(bookID, price);
					} catch (BookNotFoundException e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 5:
				System.out.println("Getting all the books: ");
				List<Book> bookList;
				try {
					bookList = bookInter.getAllBooks();
					bookList.forEach(System.out::println);
				} catch (BookNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 6:
				try {
					System.out.println("Getting book by author...\nEnter the author's name: ");
					String author = sc.nextLine();
					bookList = bookInter.getBookbyAuthor(author);
					bookList.forEach(System.out::println);
				} catch (AuthorNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 7:
				try {
					System.out.println("Getting book by category...\nEnter the category: ");
					String category = sc.nextLine();
					bookList = bookInter.getBookbyCategory(category);
					bookList.forEach(System.out::println);
				} catch (CategoryNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			}
			System.out.println("Continue??? Enter \'Y\'");
			char status = Character.toUpperCase(sc.next().charAt(0));
			sc.nextLine();
			if (status != 'Y') {
				sc.close();
				System.exit(0);
			}
		}
	}
}
