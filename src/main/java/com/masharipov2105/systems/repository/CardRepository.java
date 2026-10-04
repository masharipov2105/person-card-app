package com.masharipov2105.systems.repository;

import com.masharipov2105.systems.models.PersonModel;

public interface CardRepository{

	// save method
	boolean save(PersonModel model);

	// get method
	PersonModel get();

	// delete method
	boolean delete();
}