package programmer.zaman.now.unit.test.service;

import java.util.UUID;

import programmer.zaman.now.unit.test.model.Person;
import programmer.zaman.now.unit.test.repository.PersonRepository;

public class PersonService {

	private PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public Person get(String id) {
		
		Person person = personRepository.getById(id);
		if(person != null) {
			return person;
		}
		else {
			throw new IllegalArgumentException("Person not found");
		}
		
	}
	
	public Person register(String name) {
		Person person = new Person(UUID.randomUUID().toString(), name);
		personRepository.insert(person);
		return person;
	}
	
	
}
