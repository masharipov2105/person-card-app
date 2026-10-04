package com.masharipov2105.systems.models;

import java.time.LocalDate;

public class PersonModel{

	//fields

	private String name;
	private int age;
	private String city;
	private LocalDate createdAt;

	//getters;

	public String getName(){

		return this.name;
	}

	public int getAge(){

		return this.age;
	}

	public String getCity(){

		return this.city;
	}

	public LocalDate getCreatedAt(){

		return this.createdAt;
	}


	//setters

	public void setName(String newName){

		this.name = newName;
	}

	public void setAge(int newAge){

		this.age = newAge;
	}

	public void setCity(String newCity){

		this.city = newCity;
	}
}
