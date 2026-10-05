package com.masharipov2105.systems.repository;

import com.masharipov2105.systems.models.PersonModel;

public interface CardRepository{

	// save method
	boolean create(PersonModel model);

	// get method
	PersonModel read();

	//update method
	void update(PersonModel newModel);

	// delete method
	void delete();
}