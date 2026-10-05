package com.masharipov2105.systems.repository;

import com.masharipov2105.systems.models.PersonModel;

import java.util.HashMap;

public class CardRepositoryImpl implements CardRepository{

	private HashMap<String, PersonModel> data = new HashMap<>(); //storage (RAM)

	//overriding
	@Override
	public boolean create(PersonModel model){

		if (data.isEmpty()){

			data.put("first", model);
			return true;
		}
		
		return false;
	}

	@Override
	public PersonModel read(){

		return data.get("first");		
	}

	@Override
	public void update(PersonModel newModel){

		data.put("first", newModel);
	}

	@Override
	public void delete(){

		data.clear();
	}
}