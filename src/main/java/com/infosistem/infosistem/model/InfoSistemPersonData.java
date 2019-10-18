
package com.infosistem.infosistem.model;

import javax.persistence.*;

/**
 * @author SuzanaHersak
 *
 */

@Entity
@Table(name="PERSON")
public class InfoSistemPersonData {

	 @Id
	 @GeneratedValue(strategy= GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(name="CARD_NUMBER")
	 private Integer cardNumber;
	 
	 @Column(name="PERSON_NAME")
	 private String personName;
	 
	 @Column(name="PERSON_SURNAME")
	 private String personSurname;
	 
	 @Column(name="PERSON_ADDRESS")
	 private String personAddress;

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
	 * @return the personName
	 */
	public String getPersonName() {
		return personName;
	}

	/**
	 * @param personName the personName to set
	 */
	public void setPersonName(String personName) {
		this.personName = personName;
	}

	/**
	 * @return the personSurname
	 */
	public String getPersonSurname() {
		return personSurname;
	}

	/**
	 * @param personSurname the personSurname to set
	 */
	public void setPersonSurname(String personSurname) {
		this.personSurname = personSurname;
	}

	/**
	 * @return the personAddress
	 */
	public String getPersonAddress() {
		return personAddress;
	}

	/**
	 * @param personAddress the personAddress to set
	 */
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
}
