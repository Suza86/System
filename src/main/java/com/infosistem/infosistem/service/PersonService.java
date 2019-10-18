/**
 * 
 */
package com.infosistem.infosistem.service;

import java.util.List;
import com.infosistem.infosistem.model.InfoSistemPersonData;


/**
 * @author SuzanaHersak
 *
 */

public interface PersonService {

	 public List<InfoSistemPersonData> retrievePerson();
	  
	 public InfoSistemPersonData getPerson(Long personId);
	  
	 public void savePerson(InfoSistemPersonData person);
	  
	 public void deletePerson(Long personId);
	  
	 public void updatePerson(InfoSistemPersonData person);
}
