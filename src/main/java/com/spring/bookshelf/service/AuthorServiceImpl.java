package com.spring.bookshelf.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.bookshelf.model.Author;
import com.spring.bookshelf.repository.AuthorRepository;
import com.spring.bookshelf.service.base.AuthorService;


@Service
public class AuthorServiceImpl implements AuthorService {

	
	private AuthorRepository authorRepository;
	
	
	@Override
	@Transactional
	public void saveAuthor(Author author) {
		
		if(author != null) {
			
			authorRepository.save(author);

		}
	}

}
