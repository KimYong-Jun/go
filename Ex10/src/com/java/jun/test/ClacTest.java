package com.java.jun.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.jun.Calc;

class ClacTest {

	@Test
	void test() {
		assertEquals(1, Calc.sum(1, 0));
		assertEquals(10, Calc.sum(1, 9));
		assertEquals(15, Calc.sum(1, 14));
	}

}
