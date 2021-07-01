package programmer.zaman.now.unit.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

	@Test
	@Order(3)
	public void test3() {
		System.out.println("Ini test 3");
	}
	
	@Test
	@Order(1)
	public void test1() {
		System.out.println("Ini test 1");
	}
	
	@Test
	@Order(2)
	public void test2() {
		System.out.println("Ini test 2");
	}
	
}
