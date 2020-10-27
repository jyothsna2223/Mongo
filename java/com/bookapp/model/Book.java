package com.bookapp.model;

public class Book {
	Integer bookId;
	String title;
	String category;
	String author;
	Double price;
	
	public Book() {
		super();
	}
	
	public Book(Integer bookId, String title, String category, String author, Double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.category = category;
		this.author = author;
		this.price = price;
	}

	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", category=" + category + ", author=" + author
				+ ", price=" + price + "]";
	}
	
  
}
