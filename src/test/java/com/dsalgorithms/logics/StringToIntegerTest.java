package com.dsalgorithms.logics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {

	private static final StringToInteger STRING_TO_INTEGER = new StringToInteger();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName("Convert from string to number")
	@Test
	void testConvertStringToInt() {
		assertEquals(0, STRING_TO_INTEGER.convertStringToInt("sadagsbdhj212"));
		assertEquals(5456212, STRING_TO_INTEGER.convertStringToInt("      5456212sadagsbdhj"));
		assertEquals(-5456212, STRING_TO_INTEGER.convertStringToInt("      -5456212sadagsbdhj"));
		assertEquals(5456212, STRING_TO_INTEGER.convertStringToInt("      +5456212sadagsbdhj"));
	}

}
