package com.dsalgorithms.java8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.dsalgorithms.dto.Person;

class StreamsPracticeTest {

	private static final StreamsPractice STREAMS_PRACTICE = new StreamsPractice();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIsContainPerson() {
		assertEquals(false, STREAMS_PRACTICE.isContainPerson(new Person()));
	}

}
