package programmer.zaman.now.unit.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import programmer.zaman.now.unit.test.model.Person;
import programmer.zaman.now.unit.test.repository.PersonRepository;

@Extensions({
	@ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

	@Mock
	private PersonRepository personRepository;
	
	private PersonService personService;
	
	@BeforeEach
	public void setUp() {
		personService = new PersonService(personRepository);
	}
	
	@Test
	public void testAddNotFound() {
		assertThrows(IllegalArgumentException.class, () -> personService.get("not found"));
	}
	
	@Test
	public void testAddFound() {
		when(personRepository.getById("id")).thenReturn(new Person("id", "Andres"));
		
		Person person = personService.get("id");
		
		assertEquals("id", person.getId());
		assertEquals("Andres", person.getName());
		
	}
	
	@Test
	public void testInsertPersonSuccess() {
		
		Person person = personService.register("Andres");
		
		assertNotNull(person);
		assertEquals("Andres", person.getName());
		assertNotNull(person.getId());
		
		verify(personRepository, times(1)).insert(new Person(person.getId(), "Andres"));
	}
	
}
