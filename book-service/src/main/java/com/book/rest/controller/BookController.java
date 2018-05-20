package com.book.rest.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.rest.model.RestBook;
import com.book.rest.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public RestBook createBook(@RequestBody RestBook restBook) {
		return bookService.createBook(restBook);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public RestBook getBookById(@PathVariable UUID id) {
		return bookService.getBookById(id);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<RestBook> getAllBooks() {
		return bookService.getAllBooks();
	}
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public RestBook updateBookById(@RequestBody RestBook restBook) {
		return bookService.updateBookById(restBook);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void deleteBookById(@PathVariable UUID id) {
		bookService.deleteBookById(id);
	}
}