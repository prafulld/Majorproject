package com.cybage.model;

import java.io.Serializable;
import javax.persistence.*;



/**
 * The persistent class for the books database table.
 * 
 */
@Entity
@Table(name="books")
@NamedQuery(name="Book.findAll", query="SELECT b FROM Book b")
public class Book implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Integer bookId;

	@Column(name="BAuthor")
	private String bookAuthor;

	@Column(name="BIsbn")
	private String bookIsbn;

	@Column(name="BTitle")
	private String bookTitle;

	//bi-directional many-to-one association to Category
	
	
	//bi-directional many-to-one association to Review
	

	public Book() {
	}

	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookAuthor() {
		return this.bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public String getBookIsbn() {
		return this.bookIsbn;
	}

	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}

	public String getBookTitle() {
		return this.bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	

}