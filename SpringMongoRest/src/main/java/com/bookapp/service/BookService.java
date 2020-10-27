package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;

public interface BookService {
	
	Book addBook(Book book);
	boolean deleteBook(Integer bookId) throws BookNotFoundException;
	Book getBookById(Integer bookid)throws BookNotFoundException;
	Book updateBook(Book book);
	
	List<Book> getAllBooks();
	List<Book> getBookbyAuthor(String author) throws BookNotFoundException;;
    List<Book> getBookByCategory(String category)throws BookNotFoundException;;
    
    List<Book> findByTitleAndAuthor(String title,String author);
    List<Book> findBooksByTitleAndPrice(String title,Double price);

}
