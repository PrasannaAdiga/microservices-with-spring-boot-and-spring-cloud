package com.book.api.service;

import java.util.UUID;

import com.book.api.entity.Book;

public interface BookApiService {
	
	public Book createBook(Book book);
	public Book getBookById(UUID id);
	public Iterable<Book> getAllBooks();
	public Book updateBook(Book book);
	public void deleteBookById(UUID id);
	public void reserveBook(UUID userId, UUID bookId);
	
}
