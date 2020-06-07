package com.spring.bookshelf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.bookshelf.model.Author;
import com.spring.bookshelf.model.Book;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {

	@Query(value = "FROM Author a WHERE a.authorId = :authorId")
	public Author findWithAuthorId(@Param("authorId") Long authorId);
	
	

	@Query(value = "SELECT a FROM Author a")
	public List<Author> getAllAuthorList();
	
	

	@Query("SELECT a FROM Author a WHERE a.firstName LIKE %:firstName% ")
	public List<Author> findByAuthorName(@Param("firstName") String firstName);
	
	
}
