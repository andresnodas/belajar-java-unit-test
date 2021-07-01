package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

	private int counter;
	
	@BeforeAll
	public void beforeAll() {
		System.out.println("Before All");
	}
	
	@AfterAll
	public void afterAll() {
		System.out.println("After All");
	}
	
	@Test
	@Order(3)
	public void test3() {
		
		counter++;
		
		System.out.println("Ini test 3" + counter);
		//Ini test 33
	}
	
	@Test
	@Order(1)
	public void test1() {
		
		counter++;
		
		System.out.println("Ini test 1" + counter);
		//Ini test 11
	}
	
	@Test
	@Order(2)
	public void test2() {
		
		counter++;
		
		System.out.println("Ini test 2" + counter);
		//Ini test 22
	}
	
}
