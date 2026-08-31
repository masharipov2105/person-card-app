package com.masharipov2105.systems.storage;

import com.masharipov2105.systems.models.Person;

public class CardStorage{

    //fields
	private Person person = null;

	// save method
	public void save(Person person_){

		this.person = person_;
	}

	// get method
	public Person get(){

		return this.person;
	}

	// delete method
	public void delete(){

		this.person = null;
	}

	// exists metod
	public Boolean exists(){

		return this.person != null;
	}
}