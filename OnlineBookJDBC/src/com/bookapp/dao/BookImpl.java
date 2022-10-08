package com.bookapp.dao;

import java.sql.*;
import java.util.*;
import com.bookapp.bean.Book;
import com.bookapp.exceptions.*;

public class BookImpl implements BookInter {

	@Override
	public void addBook(Book book) {
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		try {
			statement = connection.prepareStatement("INSERT INTO ONLINEBOOK VALUES(?,?,?,?,?);");
			statement.setString(1, book.getTitle());
			statement.setString(2, book.getAuthor());
			statement.setInt(3, book.getBookID());
			statement.setString(4, book.getCategory());
			statement.setDouble(5, book.getPrice());
			statement.execute();
			System.out.println("Book added.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ModelDAO.closeConnection();
		}
	}

	@Override
	public boolean deleteBook(int bookid) throws BookNotFoundException {
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		try {

			statement = connection.prepareStatement("DELETE FROM ONLINEBOOK WHERE BOOKID=?;");
			statement.setInt(1, bookid);
			int res = statement.executeUpdate();
			if (res > 0) {
				System.out.println("Book deleted");
			} else {
				System.out.println("Book ID not available");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ModelDAO.closeConnection();
		}
		return true;
	}

	@Override
	public Book getBookById(int bookid) throws BookNotFoundException {
		Book book = null;
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		try {
			book = new Book();
			ResultSet resultset;
			statement = connection.prepareStatement("SELECT * FROM ONLINEBOOK WHERE BOOKID=?;",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1, bookid);
			resultset = statement.executeQuery();
			resultset.beforeFirst();
			if (!resultset.next())
				throw new BookNotFoundException("No books match your description.");
			resultset.beforeFirst();
			while (resultset.next()) {
				book.setTitle(resultset.getString(1));
				book.setAuthor(resultset.getString(2));
				book.setBookID(resultset.getInt(3));
				book.setCategory(resultset.getString(4));
				book.setPrice(resultset.getDouble(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ModelDAO.closeConnection();
		}
		return book;
	}

	@Override
	public boolean updateBook(int bookid, double price) throws BookNotFoundException {
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		try {
			statement = connection.prepareStatement("UPDATE ONLINEBOOK SET PRICE=? WHERE BOOKID=?;");
			statement.setDouble(1, price);
			statement.setInt(2, bookid);
			int result = statement.executeUpdate();
			if(result==0)
				throw new BookNotFoundException("Book ID not available. Not updated.");
			System.out.println("Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ModelDAO.closeConnection();
		}
		return true;
	}

	@Override
	public List<Book> getAllBooks() throws BookNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		Book book = null;
		try {
			ResultSet resultset;
			statement = connection.prepareStatement("SELECT * FROM ONLINEBOOK;", ResultSet.TYPE_SCROLL_INSENSITIVE,
					ResultSet.CONCUR_READ_ONLY);
			resultset = statement.executeQuery();
			resultset.beforeFirst();
			if (!resultset.next())
				throw new BookNotFoundException("No books match your description.");
			resultset.beforeFirst();
			while (resultset.next()) {
				book = new Book();
				book.setTitle(resultset.getString(1));
				book.setAuthor(resultset.getString(2));
				book.setBookID(resultset.getInt(3));
				book.setCategory(resultset.getString(4));
				book.setPrice(resultset.getDouble(5));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			ModelDAO.closeConnection();
		}
		return bookList;
	}

	@Override
	public List<Book> getBookbyAuthor(String author) throws AuthorNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		Book book = null;
		try {
			ResultSet resultset;
			statement = connection.prepareStatement("SELECT * FROM ONLINEBOOK WHERE AUTHOR=?;",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, author);
			resultset = statement.executeQuery();
			resultset.beforeFirst();
			if (!resultset.next())
				throw new AuthorNotFoundException("No books match your description.");
			resultset.beforeFirst();
			while (resultset.next()) {
				book = new Book();
				book.setTitle(resultset.getString(1));
				book.setAuthor(resultset.getString(2));
				book.setBookID(resultset.getInt(3));
				book.setCategory(resultset.getString(4));
				book.setPrice(resultset.getDouble(5));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}

	@Override
	public List<Book> getBookbyCategory(String category) throws CategoryNotFoundException {
		List<Book> bookList = new ArrayList<Book>();
		PreparedStatement statement = null;
		Connection connection = ModelDAO.openConnection();
		Book book = null;
		try {
			ResultSet resultset;
			statement = connection.prepareStatement("SELECT * FROM ONLINEBOOK WHERE CATEGORY=?;",
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, category);
			resultset = statement.executeQuery();
			resultset.beforeFirst();
			if (!resultset.next())
				throw new CategoryNotFoundException("No books match your description.");
			resultset.beforeFirst();
			while (resultset.next()) {
				book = new Book();
				book.setTitle(resultset.getString(1));
				book.setAuthor(resultset.getString(2));
				book.setBookID(resultset.getInt(3));
				book.setCategory(resultset.getString(4));
				book.setPrice(resultset.getDouble(5));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (statement != null)
					statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bookList;
	}
}
