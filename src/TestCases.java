import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {

	@Test
	public void test() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red",p.solve(50,75,75));
		assertEquals("Blue", p.solve(75, 10, 90));
	}

	@Test
	public void test2() {
		ProgressBar p = new ProgressBar();
		assertEquals("Red", p.solve(10, 50, 50));
	}
}
