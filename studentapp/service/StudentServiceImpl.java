package com.studentapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentapp.dao.StudentRepository;
import com.studentapp.exception.StudentNotFoundException;
import com.studentapp.model.Student;
@Service
public class StudentServiceImpl implements StudentService {
	
	
		@Autowired
		StudentRepository studentRepository;


		@Override
		public Book addBook(Book book) {
			Book newbook =bookRepository.save(book);
			
			return newbook;
		}

		@Override
		public boolean deleteBook(Integer bookId) throws BookNotFoundException {
			bookRepository.deleteById(bookId);
			return true;
		}

		@Override
		public Book getBookById(Integer bookId) throws BookNotFoundException {
			Book book=bookRepository.findById(bookId)
			.orElseThrow(()->new BookNotFoundException("Id not available"));
			return null;
			
		}      

		@Override
		public Book updateBook(Book book) {
			
			return bookRepository.save(book);
		}

		@Override
		public List<Book> getAllBooks() {
			
			return bookRepository.findAll();
		}

		@Override
		public List<Book> getBookbyAuthor(String author) throws BookNotFoundException {
			// TODO Auto-generated method stub
			return bookRepository.findByAuthor(author);
		}

		@Override
		public List<Book> getBookByCategory(String category) throws BookNotFoundException {
			// TODO Auto-generated method stub
			return  bookRepository.findByCategoryOrderByTitleAsc(category);
			
		}

		@Override
		public List<Book> findByTitleAndAuthor(String title, String author) {
			// TODO Auto-generated method stub
			return  bookRepository.findByTitleAndAuthor(title,author);
		}

		@Override
		public List<Book> findBooksByTitleAndPrice(String title, Double price) {
			// TODO Auto-generated method stub
			return bookRepository.findBooksByTitleAndPrice(title, price);
		}
				
}
