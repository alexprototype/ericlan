package balloon_project;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalloonTest {

	@Test
	public void testInflate() {
		
		Balloon b = new Balloon("red");
		b.inflate(10);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped", false, b.isPopped());
		
		b.inflate(-3);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped", false, b.isPopped());
		

		b.inflate(0);
		assertEquals("After inflating by 10 amt", 10, b.getAmount());
		assertEquals("After inflating by 10 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 10 isPopped", false, b.isPopped());

		b.inflate(90);
		assertEquals("After inflating by 90 amt", 100, b.getAmount());
		assertEquals("After inflating by 90 capacity", 100, b.getCapacity());
		assertEquals("After inflating by 90 isPopped", false, b.isPopped());

		b.inflate(1);
		assertEquals("After inflating by 1 amt", 0, b.getAmount());
		assertEquals("After inflating by 1 capacity", 0, b.getCapacity());
		assertEquals("After inflating by 1 isPopped", true, b.isPopped());

		b.inflate(10);
		assertEquals("After popping amt", 0, b.getAmount());
		assertEquals("After popping capacity", 0, b.getCapacity());
		assertEquals("After popping isPopped", true, b.isPopped());
		
		String main = "amount=0 capacity=100 color=Green popped=false";
		main += "amount=0 capacity=100 color=Green popped=false";
		main += "amount=10 capacity=100 color=Green popped=false";
		main += "amount=60 capacity=100 color=Green popped=false";
		main += "amount=60 capacity=100 color=Green popped=falseamount=0 capacity=0 color=Blue popped=true";
		main += "amount=0 capacity=0 color=Blue popped=trueamount=60 capacity=100 color=Green popped=false";
		String yours = "amount=0 capacity=100 color=Green popped=falseamount=0 capacity=100 color=Green popped=falseamount=10 capacity=100 color=Green popped=falseamount=60 capacity=100 color=Green popped=falseamount=60 capacity=100 color=Green popped=falseamount=0 capacity=0 color=Blue popped=trueamount=0 capacity=0 color=Blue popped=trueamount=60 capacity=100 color=Green popped=false";
		assertEquals(main, yours);
	}

}
