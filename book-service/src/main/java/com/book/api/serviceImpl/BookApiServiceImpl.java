package com.book.api.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.api.entity.Book;
import com.book.api.repository.BookRepository;
import com.book.api.service.BookApiService;

@Service
public class BookApiServiceImpl implements BookApiService {

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
	public Book updateBookById(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public void deleteBookById(UUID id) {
		bookRepository.delete(id);
	}

}
