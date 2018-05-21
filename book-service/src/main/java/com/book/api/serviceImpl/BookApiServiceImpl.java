package com.book.api.serviceImpl;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.api.entity.Book;
import com.book.api.repository.BookRepository;
import com.book.api.service.BookApiService;

@Service
public class BookApiServiceImpl implements BookApiService {

	private final static Logger logger = LoggerFactory.getLogger(BookApiServiceImpl.class);

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book createBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public Book getBookById(UUID id) {
		return bookRepository.findOne(id);
	}

	@Override
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	@Override
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(UUID id) {
		bookRepository.delete(id);
	}

	@Override
	public void reserveBook(UUID userId, UUID bookId) {
		Book book = bookRepository.findOne(bookId);
		
		if(book != null) {
			if(book.getUserId() == null) {
				book.setUserId(userId);
				bookRepository.save(book);
			} else {
				try {
					throw new Exception("This book is already reserved by user");
				} catch (Exception e) {
					logger.error("This book is already reserved by user");
				}
			}
		}
	}
	
}
