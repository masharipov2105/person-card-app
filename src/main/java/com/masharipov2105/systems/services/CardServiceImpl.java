package com.masharipov2105.systems.service;

import com.masharipov2105.systems.models.Person;
import com.masharipov2105.systems.service.CardService;
import com.masharipov2105.systems.storage.CardStorage;

public class CardServiceImpl implements CardService{

    // fields
	private CardStorage cd;

	//konstructor
	public CardServiceImpl(CardStorage cd_){

		this.cd = cd_;
	}

	@Override
	public void createCard(String name, int age, String city) throws Exception{

		if (!this.cd.exists()){

			if (name == null || name.isEmpty()){

				throw new Exception("name cannot be empty");
			} if (age <= 0){

				throw new Exception("age cannot be negative or zero");
			} if (city == null || city.isEmpty()){

				throw new Exception("city cannot be empty");
			}

			Person person = new Person(name, age, city);
			this.cd.save(person);
		} else{

			throw new Exception("card already exists !");
		}
	}

	@Override
	public Person viewCard(){

		return this.cd.get();
	}

	@Override
	public void updateName(String name_) throws Exception{

		if (this.cd.exists()){

			if (name_ == null || name_.isEmpty()){

				throw new Exception("name cannot be empty");
			}

			Person person = this.cd.get();
			person.setName(name_);
		} else{

			throw new Exception("card not available");
		}
	}

	@Override
	public void updateAge(int age_) throws Exception{

		if (this.cd.exists()){

			if (age_ <= 0){

				throw new Exception("age cannot be negative or zero");
			}

			Person person = this.cd.get();
			person.setAge(age_);
		} else{

			throw new Exception("card not available");
		}
	}

	@Override
	public void updateCity(String city_) throws Exception{

		if (this.cd.exists()){

			if (city_ == null || city_.isEmpty()){

				throw new Exception("city cannot be empty");
			}

			Person person = this.cd.get();
			person.setCity(city_);
		} else{

			throw new Exception("card not available");
		}
	}

	@Override
	public void deleteCard() throws Exception{

		this.cd.delete();
	}

	@Override
	public Boolean hasCard(){

		return this.cd.exists();
	}
}