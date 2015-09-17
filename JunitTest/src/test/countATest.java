package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class countATest {

	@Test
	public void test() {
		PruebaJunit test = new PruebaJunit();
		int output = test.countA("Carina");
		assertEquals(2, output);
		
	}

}
