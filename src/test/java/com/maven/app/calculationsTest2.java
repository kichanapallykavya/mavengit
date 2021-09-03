package com.maven.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calculationsTest2 {

	@Test
	void test() {
		calculations calculations=new calculations();
		int expected=10;
		int actual=calculations.add(5, 5);
		assertEquals(expected, actual);
	}

}
