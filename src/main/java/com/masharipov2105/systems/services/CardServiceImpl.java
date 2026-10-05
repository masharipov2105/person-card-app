package com.masharipov2105.systems.services;

import com.masharipov2105.systems.models.*;
import com.masharipov2105.systems.repository.CardRepository;

import java.time.LocalDate;

public class CardServiceImpl implements CardService{

	//fields
	private CardRepository repository;

	//constructor
	public CardServiceImpl(CardRepository repository){

		this.repository = repository;
	}

	@Override
	public void createCard(RequestModel model) throws Exception{

		if (model.getAge() >= 18){

			PersonModel personModel = new PersonModel();
			personModel.setName(model.getName());
			personModel.setAge(model.getAge());
			personModel.setCity(model.getCity());
			personModel.setCreatedAt(LocalDate.now());

			if (!this.repository.create(personModel)){

				throw new Exception("The card has already been created.");
			}
		} else{

			throw new Exception("Age cannot be under 18.");
		}
	}

	@Override
	public ResponseModel readCard(){

		if (this.repository.read() != null){

			PersonModel personModel = this.repository.read();

			ResponseModel model = new ResponseModel();
			model.setName(personModel.getName());
			model.setAge(personModel.getAge());
			model.setCity(personModel.getCity());

			return model;
		} 

		return null;
	}

	@Override
	public void updateCard(RequestModel newModel) throws Exception{

		if (newModel.getAge() >= 18){

			PersonModel personModel = new PersonModel();
			personModel.setName(newModel.getName());
			personModel.setAge(newModel.getAge());
			personModel.setCity(newModel.getCity());
			personModel.setCreatedAt(this.repository.read().getCreatedAt());

			this.repository.update(personModel);
		} else{

			throw new Exception("Age cannot be under 18.");
		}
	}

	@Override
	public void deleteCard() throws Exception{

		this.repository.delete();
	}
}