package com.masharipov2105.systems.repository;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import com.masharipov2105.systems.models.PersonModel;

import java.time.LocalDate;

public class CardRepositoryTest{

	private CardRepository repo;
	private PersonModel model, model2;

	@BeforeEach
	public void setUp(){

		repo = new CardRepositoryImpl();

		model = new PersonModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");
		model.setCreatedAt(LocalDate.now());

		model2 = new PersonModel();
		model2.setName("Vali");
		model2.setAge(22);
		model2.setCity("Mangit");
		model2.setCreatedAt(LocalDate.now());
	}

	@Test
	void testCreate(){

		assertEquals(true, repo.create(model));
		assertEquals(false, repo.create(model));
	}

	@Test
	void testRead(){

		repo.create(model);
		assertEquals(model, repo.read());
	}

	@Test
	void testUpdate(){

		repo.create(model);

		assertEquals(false, repo.read() == model2);

		repo.update(model2);

		assertEquals(true, repo.read() == model2);

	}

	@Test
	void testDelete(){

		assertEquals(true, repo.read() == null);

		repo.create(model);

		assertEquals(false, repo.read() == null);

		repo.delete();

		assertEquals(true, repo.read() == null);
	}
}