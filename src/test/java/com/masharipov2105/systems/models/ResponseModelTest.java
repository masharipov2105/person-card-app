package com.masharipov2105.systems.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

public class ResponseModelTest{

	private ResponseModel model;

	@BeforeEach
	public void setUp(){

		model = new ResponseModel();
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

	@Test
	void testToString(){

		assertEquals("{}", model.toString());

		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		assertEquals("{name = Ali, age = 18, city = Mangit}", model.toString());
	}
}