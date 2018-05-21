package com.book.rest.convertor;

import org.springframework.stereotype.Component;

import com.book.api.entity.Book;
import com.book.rest.model.RestBook;

@Component
public class BookConvertor {
	
	public Book convertToEntity(RestBook restBook) {
		Book book = new Book();
		
		book.setId(restBook.getId());
		book.setName(restBook.getName());
		book.setAuthor(restBook.getAuthor());
		book.setLanguage(restBook.getLanguage());
		book.setVersion(restBook.getVersion());
		book.setTotalPage(restBook.getTotalPage());
		book.setReleasedDate(restBook.getReleasedDate());
		
		return book;
	}

	public RestBook convertToRest(Book book) {
		RestBook restBook = new RestBook();
		
		restBook.setId(book.getId());
		restBook.setUserId(book.getUserId());
		restBook.setName(book.getName());
		restBook.setAuthor(book.getAuthor());
		restBook.setLanguage(book.getLanguage());
		restBook.setTotalPage(book.getTotalPage());
		restBook.setVersion(book.getVersion());
		restBook.setReleasedDate(book.getReleasedDate());
		
		return restBook;
	}

}
