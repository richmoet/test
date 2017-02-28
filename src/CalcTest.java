import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {
	@Test (expected=ArithmeticException.class)
	public void subtractTest() {
		assertEquals(Calc.subtract(0, 0), 1);
		assertEquals(Calc.subtract(10, 5), 5);
		assertEquals(Calc.subtract(5, 10), -5);
		assertEquals(Calc.subtract(-10, -5), -5);
		
		Calc.subtract(Integer.MIN_VALUE, 100);
		fail("Calc.subtract did not throw ArithmeticException.");
	}
	
	@Test (expected=ArithmeticException.class)
	public void multiplyTest() {
		assertEquals(Calc.multiply(0, 0), 0);
		assertEquals(Calc.multiply(10, 0), 0);
		assertEquals(Calc.multiply(10, 5), 50);
		assertEquals(Calc.multiply(-10, 5), -50);
		assertEquals(Calc.multiply(-10, -5), 50);

		Calc.multiply(Integer.MAX_VALUE, 100);
		fail("Calc.multiply did not throw ArithmeticException.");
	}
	
	@Test (expected=ArithmeticException.class)
	public void divideTest() {
		assertEquals(Calc.divide(0, 1), 0);
		assertEquals(Calc.divide(100, 10), 10);
		assertEquals(Calc.divide(-100, 10), -10);
		assertEquals(Calc.divide(-100, -10), 10);

		Calc.divide(1, 0);
		fail("Calc.divide did not throw ArithmeticException.");
	}
}
