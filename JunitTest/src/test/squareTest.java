package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		PruebaJunit test = new PruebaJunit();
		int output = test.square(6);
		assertEquals(36, output);
	}

}
