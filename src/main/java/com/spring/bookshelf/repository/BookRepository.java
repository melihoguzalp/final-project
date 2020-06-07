package com.spring.bookshelf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.bookshelf.model.Book;


@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

	
	
	@Query(value = "FROM Book b WHERE b.bookId = :bookId")
	public Book findWithBookId(@Param("bookId") Long bookId);
	
	
	
	@Query(value = "SELECT b FROM Book b")
	public List<Book> getAllBookList();
	
	

	@Query("SELECT b FROM Book b WHERE b.bookName LIKE %:bookName% ")
	public List<Book> findByBookName(@Param("bookName") String bookName);
	
	
	
	
	
}
