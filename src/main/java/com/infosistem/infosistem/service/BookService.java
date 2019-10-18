/**
 * 
 */
package com.infosistem.infosistem.service;

import java.util.List;
import com.infosistem.infosistem.model.InfoSistemBookData;

/**
 * @author SuzanaHersak
 *
 */
public interface BookService {
	
	 public List<InfoSistemBookData> retrieveBook();
	  
	 public InfoSistemBookData getBook(Long bookId);
	  
	 public void saveBook(InfoSistemBookData book);
	  
	 public void deleteBook(Long bookId);
	  
	 public void updateBook(InfoSistemBookData book);

}
