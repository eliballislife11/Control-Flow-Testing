import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void test() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red",p.solve(50,75,75));
		assertEquals("Red", p.solve(30,70,50));
	}

	@Test
	public void test2() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red",p.solve(75, 50, 40));
		assertEquals("Red",p.solve(1, 50, 50));
		assertEquals("Blue",p.solve(25, 20, 20));
	}
}
