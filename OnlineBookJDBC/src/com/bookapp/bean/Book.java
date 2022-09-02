package com.bookapp.bean;

public class Book {
	String title;
	int bookID;
	String author;
	double price;
	String category;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getBookID() {
		return bookID;
	}
	
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Book [Title=" + title + ", Book ID=" + bookID + ", Author=" + author + ", Price=" + price + ", Category="
				+ category + "]";
	}
	
}
