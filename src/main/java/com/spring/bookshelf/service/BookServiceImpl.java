package com.spring.bookshelf.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bookshelf.model.Book;
import com.spring.bookshelf.repository.BookRepository;
import com.spring.bookshelf.service.base.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;
	
	
	@Override
	public Book findByBookId(Long bookid) {

		return bookRepository.findWithBookId(bookid);
	}

	
//	
//	@Override
//	public Book saveBook(Book book) {
//		
//		
//			
//		return bookRepository.save(book);
//			
//		
//
//	}
//


	
	
	@Override
	public List<Book> findAllList() {
		
		return bookRepository.getAllBookList();
	}



	@Override
	public List<Book> searchBook(String bookName) {

		
			return bookRepository.findByBookName(bookName);

		
	}



	

}
