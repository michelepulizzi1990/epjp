package b05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimplejavaTest {

	@Test
	void isEvenTrue() {
		Simplejava simple = new Simplejava();
		boolean result = simple.isEven(42);
		
		assertTrue(result);		
	}

	@Test
	void isEvenFalse() {
		Simplejava simple = new Simplejava();
		boolean result = simple.isEven(-43);
		
		assertFalse(result);
	}
	
	
	@Test
	void isEvenZero() {
		Simplejava simple = new Simplejava();
		boolean result = simple.isEven(0);
		
		assertTrue(result);
}
