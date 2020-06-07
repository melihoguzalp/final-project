package com.spring.bookshelf.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bookshelf.model.Book;
import com.spring.bookshelf.service.base.BookService;

@RestController			
@RequestMapping("/library")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.GET)
	public Book findByBookId(@PathVariable("id") Long id){
		
		return bookService.findByBookId(id);
			
	}
	
	@RequestMapping(value = "/book/list", method = RequestMethod.GET)
	public List<Book> getAllBookList(){
		
		return bookService.findAllList();
			
	}
	
	
	

}
