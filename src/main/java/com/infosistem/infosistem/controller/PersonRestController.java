/**
 * 
 */
package com.infosistem.infosistem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.infosistem.infosistem.model.InfoSistemPersonData;
import com.infosistem.infosistem.service.PersonService;


/**
 * @author SuzanaHersak
 *
 */

@RestController
public class PersonRestController {

	@Autowired
	private PersonService personService;

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/api/person")
	public List<InfoSistemPersonData> getPerson() {
		List<InfoSistemPersonData> person = personService.retrievePerson();
		return person;
	}

	@GetMapping("/api/person/{personId}")
	public InfoSistemPersonData getPerson(@PathVariable(name = "personId") Long personId) {
		return personService.getPerson(personId);
	}

	@PostMapping("/api/person")
	public void savePerson(InfoSistemPersonData person) {
		personService.savePerson(person);
		System.out.println("New person is saved Successfully!");
	}

	@DeleteMapping("/api/person/{personId}")
	public void deletePerson(@PathVariable(name = "personId") Long personId) {
		personService.deletePerson(personId);
		System.out.println("Person is deleted Successfully!");
	}

	@PutMapping("/api/person/{personId}")
	public void updatePerson(@RequestBody InfoSistemPersonData person, @PathVariable(name = "personId") Long personId) {
		InfoSistemPersonData emp = personService.getPerson(personId);
		if (emp != null) {
			personService.updatePerson(person);
		}
	}
}
