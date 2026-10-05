package com.masharipov2105.systems.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import com.masharipov2105.systems.repository.*;
import com.masharipov2105.systems.models.RequestModel;

import java.time.LocalDate;

public class CardServiceImplTest{

	private CardService service;
	private CardRepository repository = new CardRepositoryImpl();

	@BeforeEach
	public void setUp(){

		service = new CardServiceImpl(repository);
	}

	@Test
	void testCreateCard() throws Exception{

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		service.createCard(model);

		assertEquals("Ali", service.readCard().getName());
	    assertEquals(18, service.readCard().getAge());
	    assertEquals("Mangit", service.readCard().getCity());
	}

	@Test
	void testCreateCardException() throws Exception{

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		service.createCard(model);

		assertEquals("Ali", service.readCard().getName());
	    assertEquals(18, service.readCard().getAge());
	    assertEquals("Mangit", service.readCard().getCity());

	    Exception exp = assertThrows(Exception.class, ()->{service.createCard(model);});
	    assertEquals("The card has already been created.", exp.getMessage());
	}

	@Test
	void testCreateCardError() throws Exception{

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(15);
		model.setCity("Mangit");

		Exception exp = assertThrows(Exception.class, ()->{service.createCard(model);});
		assertEquals("Age cannot be under 18.", exp.getMessage());
	}

	@Test
	void testReadCard() throws Exception{

		assertEquals(null, service.readCard());

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		service.createCard(model);

		assertEquals(false, service.readCard() == null);

		assertEquals("Ali", service.readCard().getName());
	    assertEquals(18, service.readCard().getAge());
	    assertEquals("Mangit", service.readCard().getCity());
	}

	@Test
	void testUpdateCard() throws Exception{

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		RequestModel model2 = new RequestModel();

		model2.setName("Vali");
		model2.setAge(22);
		model2.setCity("Mangit");

		service.createCard(model);

		assertEquals(false, service.readCard() == null);

		service.updateCard(model2);

		assertEquals("Vali", service.readCard().getName());
		assertEquals(22, service.readCard().getAge());
		assertEquals("Mangit", service.readCard().getCity());
	}

	@Test
	void testUpdateModelError() throws Exception{

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		RequestModel model2 = new RequestModel();

		model2.setName("Vali");
		model2.setAge(10);
		model2.setCity("Mangit");

		service.createCard(model);

		assertEquals(false, service.readCard() == null);

		Exception exp = assertThrows(Exception.class, ()->{service.updateCard(model2);});
		assertEquals("Age cannot be under 18.", exp.getMessage());
	}

	@Test
	void testCardDepete() throws Exception{

		assertEquals(true, service.readCard() == null);

		RequestModel model = new RequestModel();
		model.setName("Ali");
		model.setAge(18);
		model.setCity("Mangit");

		service.createCard(model);

		assertEquals(false, service.readCard() == null);

		service.deleteCard();

		assertEquals(true, service.readCard() == null);
	}
}