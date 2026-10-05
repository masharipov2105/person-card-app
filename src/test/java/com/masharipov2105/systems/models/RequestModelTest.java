package com.masharipov2105.systems.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class RequestModelTest{

	private RequestModel model;

	@BeforeEach
	public void setUp(){

		model = new RequestModel();
	}

	@Test
	void testName(){

		model.setName("Ali");
		assertEquals("Ali", model.getName());
	}

	@Test
	void testAge(){

		model.setAge(18);
		assertEquals(18, model.getAge());
	}

	@Test
	void testCity(){

		model.setCity("Mangit");
		assertEquals("Mangit", model.getCity());
	}
}