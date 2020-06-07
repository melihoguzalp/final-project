package com.spring.bookshelf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;



@Entity
@Table(name = "book")
public class Book implements Serializable {

    private static final long serialVersionUID = 2963836225863110941L;



	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@org.springframework.data.annotation.Id
	@Column(name = "book_id")
	private long id;
	
	@Column(name = "first_name")
    private String bookName;
	
	@Column(name = "publish_year")
    private int publishYear;
	
	@Column(name = "book_description")
    private String desctiption;
    
	
	@Column(name = "book_comment")
    private String comment;
	
	//@JsonIgnore
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
			name = "author_book",
			joinColumns = { @JoinColumn(name = "book_id") },
			inverseJoinColumns =  { @JoinColumn(name = "aouthor_id") }
	)
    private List<Author> author;

    
    
    public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public int getPublishYear() {
		return publishYear;
	}


	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}
 

	public String getDesctiption() {
		return desctiption;
	}


	public void setDesctiption(String desctiption) {
		this.desctiption = desctiption;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public List<Author> getAuthor() {
		return author;
	}


	public void setAuthor(List<Author> author) {
		this.author = author;
	}
    
}
