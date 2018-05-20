package com.book.api.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.book.api.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, UUID> {

}
