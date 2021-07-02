package programmer.zaman.now.unit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("A queue")
public class QueueTest {

	private Queue<String> queue;
	
	@Nested
	@DisplayName("when new")
	public class WhenNew {
		
		@BeforeEach
		public void setUp() {
			queue = new LinkedList<>();
		}
		
		@Test
		@DisplayName("when offer, size must be 1")
		public void offerNewData() {
			queue.offer("Andres");
			assertEquals(1, queue.size());
		}
		
		@Test
		@DisplayName("when offer 2 data, size must be 2")
		public void offerMoreData() {
			queue.add("Andres");
			queue.add("Nodas");
			assertEquals(2, queue.size());
		}
		
	}
	
}
