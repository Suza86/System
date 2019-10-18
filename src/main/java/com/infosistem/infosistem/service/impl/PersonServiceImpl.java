/**
 * 
 */
package com.infosistem.infosistem.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.infosistem.infosistem.model.InfoSistemPersonData;
import com.infosistem.infosistem.service.PersonService;
import com.infosistem.infosistem.repository.PersonRepository;


/**
 * @author SuzanaHersak
 *
 */

@Service
public class PersonServiceImpl implements PersonService{

	@Autowired
	 private PersonRepository personRepository;
	 
	 public void setPersonRepository(PersonRepository personRepository) {
	  this.personRepository = personRepository;
	 }
	  
	 public List<InfoSistemPersonData> retrievePerson() {
	  List<InfoSistemPersonData> person = personRepository.findAll();
	  return person;
	 }
	  
	 public InfoSistemPersonData getPerson(Long personId) {
	  Optional<InfoSistemPersonData> optEmp = personRepository.findById(personId);
	  return optEmp.get();
	 }
	  
	 public void savePerson(InfoSistemPersonData person){
		 personRepository.save(person);
	 }
	  
	 public void deletePerson(Long personId){
		 personRepository.deleteById(personId);
	 }
	  
	 public void updatePerson(InfoSistemPersonData person) {
		 personRepository.save(person);
	 }
}
