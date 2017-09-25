import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void test() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red",p.solve(90,35,65));
		assertEquals("Red", p.solve(30,70,50));
	}

	@Test
	public void test2() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red",p.solve(75, 40, 50));
		assertEquals("Red",p.solve(1, 50, 50));
		assertEquals("Blue",p.solve(25, 20, 20));
	}
}
