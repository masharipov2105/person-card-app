package com.masharipov2105.systems.storage;

import com.masharipov2105.systems.models.Person;
import com.masharipov2105.systems.storage.CardStorage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardStorageTest{

	@Test
	void testSave(){

		Person p = new Person("Ali", 18, "Mangit");
		CardStorage cd = new CardStorage();

        assertEquals(null, cd.get());
		cd.save(p);
		assertEquals(p, cd.get());
	}

	@Test
	void testGet(){

		Person p = new Person("Ali", 18, "Mangit");
		CardStorage cd = new CardStorage();
		cd.save(p);
		assertEquals(p, cd.get());
	}

	@Test
	void testDelete(){

		Person p = new Person("Ali", 18, "Mangit");
		CardStorage cd = new CardStorage();
		cd.save(p);
		assertEquals(p, cd.get());
		cd.delete();
		assertEquals(null, cd.get());
	}

	@Test
	void testExists(){

		Person p = new Person("Ali", 18, "Mangit");
		CardStorage cd = new CardStorage();

		assertEquals(false, cd.exists());

		cd.save(p);
		assertEquals(true, cd.exists());
	}
}