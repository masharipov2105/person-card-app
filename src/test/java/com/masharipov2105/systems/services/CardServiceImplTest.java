package com.masharipov2105.systems.services;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.masharipov2105.systems.models.Person;
import com.masharipov2105.systems.storage.CardStorage;
import com.masharipov2105.systems.services.CardServiceImpl;

public class CardServiceImplTest{

    //=========================== createCard =====================================
	@Test
	void testCreateCardSuccess() throws Exception{

		CardServiceImpl csi = new CardServiceImpl(new CardStorage());

        csi.createCard("Ali", 23, "Mangit");
        Person p = csi.viewCard();

        assertNotNull(p);
        assertEquals("Ali", p.getName());
        assertEquals(23, p.getAge());
        assertEquals("Mangit", p.getCity());

	}

    @Test
    void testCreateCardWhenExists() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        csi.createCard("Ali", 23, "Mangit");
        Exception exp = assertThrows(Exception.class,()-> {csi.createCard("Vali", 20, "Toshkent");});
        assertEquals("card already exists !", exp.getMessage());
    }

    @Test
    void testCreateCardWithEmptyName() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        Exception exp = assertThrows(Exception.class,()-> {csi.createCard("", 20, "Toshkent");});
        assertEquals("name cannot be empty", exp.getMessage());
    }

    @Test
    void testCreateCardWithInvalidAge() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        Exception exp = assertThrows(Exception.class,()-> {csi.createCard("Ali", -2, "Toshkent");});
        assertEquals("age cannot be negative or zero", exp.getMessage());      
    }

    @Test
    void testCreateCardWithEmptyCity() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        Exception exp = assertThrows(Exception.class,()-> {csi.createCard("Ali", 20, "");});
        assertEquals("city cannot be empty", exp.getMessage());
    }




    //================================ updateName ====================================

    @Test
    void testUpdateNameSuccess() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        csi.createCard("Ali", 23, "Toshkent");
        Person p = csi.viewCard();
        p.setName("Vali");
        assertEquals("Vali", csi.viewCard().getName());
    }

    @Test
    void testUpdateNameWhenNoCard() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        Person p = csi.viewCard();
        assertNull(p);
        Exception exp = assertThrows(Exception.class, ()->{csi.updateName("Vali");});
        assertEquals("card not available", exp.getMessage());
    }

    @Test
    void testUpdateNameWithEmptyName() throws Exception{

        CardServiceImpl csi = new CardServiceImpl(new CardStorage());
        csi.createCard("Ali", 23, "Mangit");
        Person p = csi.viewCard();
        Exception exp = assertThrows(Exception.class, ()->{csi.updateName("");});
        assertEquals("name cannot be empty", exp.getMessage());
    }
}