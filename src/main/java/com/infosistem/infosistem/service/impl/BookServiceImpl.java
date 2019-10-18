/**
 * 
 */
package com.infosistem.infosistem.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.infosistem.infosistem.model.InfoSistemBookData;
import com.infosistem.infosistem.repository.BookRepository;
import com.infosistem.infosistem.service.BookService;

/**
 * @author SuzanaHersak
 *
 */

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	 private BookRepository bookRepository;
	 
	 public void setBookRepository(BookRepository bookRepository) {
	  this.bookRepository = bookRepository;
	 }
	  
	 public List<InfoSistemBookData> retrieveBook() {
	  List<InfoSistemBookData> book = bookRepository.findAll();
	  return book;
	 }
	  
	 public InfoSistemBookData getBook(Long bookId) {
	  Optional<InfoSistemBookData> optEmp = bookRepository.findById(bookId);
	  return optEmp.get();
	 }
	  
	 public void saveBook(InfoSistemBookData book){
      bookRepository.save(book);
	 }
	  
	 public void deleteBook(Long bookId){
		 bookRepository.deleteById(bookId);
	 }
	  
	 public void updateBook(InfoSistemBookData book) {
		 bookRepository.save(book);
	 }
}
