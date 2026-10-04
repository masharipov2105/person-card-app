package com.masharipov2105.systems.repository;

import com.masharipov2105.systems.models.PersonModel;

public class CardRepositoryImpl implements CardRepository{

	//overriding
	@Override
	public boolean save(PersonModel model){

		boolean result = false;

		return result;
	}

	@Override
	public PersonModel get(){

		return new PersonModel();		
	}

	@Override
	public boolean delete(){

		boolean result = false;

		return result;
	}

}