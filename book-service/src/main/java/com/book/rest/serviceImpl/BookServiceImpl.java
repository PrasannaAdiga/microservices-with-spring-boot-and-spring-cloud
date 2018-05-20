package com.book.rest.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.api.entity.Book;
import com.book.api.service.BookApiService;
import com.book.rest.convertor.BookConvertor;
import com.book.rest.model.RestBook;
import com.book.rest.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookConvertor bookConvertor;

	@Autowired
	BookApiService bookApiService;

	@Override
	public RestBook createBook(RestBook restBook) {
		Book book = bookApiService.createBook(bookConvertor.convertToEntity(restBook));
		return bookConvertor.convertToRest(book);
	}

	@Override
	public RestBook getBookById(UUID id) {
		Book book = bookApiService.getBookById(id);
		return bookConvertor.convertToRest(book);
	}

	@Override
	public List<RestBook> getAllBooks() {
		List<RestBook> restBooks = new ArrayList<>(); 
		Iterable<Book> books = bookApiService.getAllBooks();
		books.forEach(book -> {
			restBooks.add(bookConvertor.convertToRest(book));
		});
		return restBooks;
	}

	@Override
	public RestBook updateBookById(RestBook restBook) {
		Book book = bookApiService.updateBookById(bookConvertor.convertToEntity(restBook));
		return bookConvertor.convertToRest(book);
	}

	@Override
	public void deleteBookById(UUID id) {
		bookApiService.deleteBookById(id);
	}

}
