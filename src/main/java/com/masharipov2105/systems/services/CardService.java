package com.masharipov2105.systems.service;

import com.masharipov2105.systems.models.Person;

public interface CardService{

	void createCard(String name, int age, String city) throws Exception;
	Person viewCard();
	void updateName(String name_) throws Exception;
	void updateAge(int age_) throws Exception;
	void updateCity(String city_) throws Exception;
	void deleteCard() throws Exception;
	Boolean hasCard();
}