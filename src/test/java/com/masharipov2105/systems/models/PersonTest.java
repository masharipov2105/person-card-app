package com.masharipov2105.systems.models;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.masharipov2105.systems.models.Person;

public class PersonTest{

	@Test
	void testGetName(){

		Person p = new Person("Ali",18,"Mangit");
		assertEquals("Ali", p.getName());
	}

	@Test
	void testGetAge(){

		Person p = new Person("Ali",18,"Mangit");
		assertEquals(18, p.getAge());
	}

	@Test
	void testGetCity(){

		Person p = new Person("Ali",18,"Mangit");
		assertEquals("Mangit", p.getCity());
	}

	@Test
	void testSetName(){

		Person p = new Person("Ali",18,"Mangit");
		try{

			p.setName("Vali");
			assertEquals("Vali", p.getName());
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Test
	void testSetAge(){

		Person p = new Person("Ali",18,"Mangit");
		try{

			p.setAge(20);
			assertEquals(20, p.getAge());
		} catch(Exception e){

			System.out.println(e.getMessage());
		}
	}

	@Test
	void testSetCity(){

		Person p = new Person("Ali",18,"Mangit");
		try{

			p.setCity(null);
			assertEquals("Amudaryo", p.getCity());
		} catch(Exception e){

			System.out.println(e.getMessage());
		}
	}

    @Test
    void testToString(){

    	Person p = new Person("Ali",18,"Mangit");

    	assertEquals("{name = Ali, age = 18, city = Mangit}", p.toString());
    }
}