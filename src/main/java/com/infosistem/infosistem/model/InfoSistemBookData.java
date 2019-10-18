/**
 * 
 */
package com.infosistem.infosistem.model;

import javax.persistence.*;

/**
 * @author SuzanaHersak
 *
 */

@Entity
@Table(name="BOOK")
public class InfoSistemBookData {
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="INVENTORY_NUMBER")
	 private Integer inventoryNumber;
	 
	 @Column(name="BOOK_TITLE")
	 private String bookTitle;
	 
	 @Column(name="BOOK_AUTHOR")
	 private String bookAuthor;
	 
	 @Column(name="BOOK_GENRES")
	 private String bookGenres;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the inventoryNumber
	 */
	public Integer getInventoryNumber() {
		return inventoryNumber;
	}

	/**
	 * @param inventoryNumber the inventoryNumber to set
	 */
	public void setInventoryNumber(Integer inventoryNumber) {
		this.inventoryNumber = inventoryNumber;
	}

	/**
	 * @return the bookTitle
	 */
	public String getBookTitle() {
		return bookTitle;
	}

	/**
	 * @param bookTitle the bookTitle to set
	 */
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	/**
	 * @return the bookAuthor
	 */
	public String getBookAuthor() {
		return bookAuthor;
	}

	/**
	 * @param bookAuthor the bookAuthor to set
	 */
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	/**
	 * @return the bookGenres
	 */
	public String getBookGenres() {
		return bookGenres;
	}

	/**
	 * @param bookGenres the bookGenres to set
	 */
	public void setBookGenres(String bookGenres) {
		this.bookGenres = bookGenres;
	}
}
