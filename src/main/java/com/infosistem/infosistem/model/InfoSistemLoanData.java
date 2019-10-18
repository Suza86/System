package com.infosistem.infosistem.model;

import java.sql.Timestamp;

import javax.persistence.*;

/**
 * @author SuzanaHersak
 *
 */

@Entity
@Table(name="LOAN")
public class InfoSistemLoanData {
	
	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="INVENTORY_NUMBER")
	 private Integer inventoryNumber;
	 
	 @Column(name="CARD_NUMBER")
	 private Integer cardNumber;
	 
	 @Column(name="BOOK_DATE_LOAN")
	 private Timestamp bookDateLoan;
	 
	 @Column(name="BOOK_DATE_RETURN")
	 private Timestamp bookDateReturn;

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
	 * @return the cardNumber
	 */
	public Integer getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(Integer cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the bookDateLoan
	 */
	public Timestamp getBookDateLoan() {
		return bookDateLoan;
	}

	/**
	 * @param bookDateLoan the bookDateLoan to set
	 */
	public void setBookDateLoan(Timestamp bookDateLoan) {
		this.bookDateLoan = bookDateLoan;
	}

	/**
	 * @return the bookDateReturn
	 */
	public Timestamp getBookDateReturn() {
		return bookDateReturn;
	}

	/**
	 * @param bookDateReturn the bookDateReturn to set
	 */
	public void setBookDateReturn(Timestamp bookDateReturn) {
		this.bookDateReturn = bookDateReturn;
	}
}
