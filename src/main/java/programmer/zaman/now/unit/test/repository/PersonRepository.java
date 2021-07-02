package programmer.zaman.now.unit.test.repository;

import programmer.zaman.now.unit.test.model.Person;

public interface PersonRepository {

	Person getById(String id);
	
	void insert(Person person);
	
}
