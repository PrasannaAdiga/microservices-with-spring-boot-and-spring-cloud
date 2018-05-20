package com.book.rest.service;

import java.util.List;
import java.util.UUID;

import com.book.rest.model.RestBook;

public interface BookService {
	
	public RestBook createBook(RestBook restBook);
	public RestBook getBookById(UUID id);
	public List<RestBook> getAllBooks();
	public RestBook updateBookById(RestBook restBook);
	public void deleteBookById(UUID id);
	
}
