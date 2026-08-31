package com.masharipov2105.systems.service;

import com.masharipov2105.systems.models.Person;

public interface CardService{

	void createCard(String name, int age, String city);
	Person viewCard();
	void updateName(String name_);
	void updateAge(int age_);
	void updateCity(String city_);
	void deleteCard();
	Boolean hasCard();
}