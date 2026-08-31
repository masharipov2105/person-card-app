package com.masharipov2105.systems.models;

public class Person{

	// fields
	private String name;
	private int age;
	private String city;

	//kosntructor
	public Person(String name_, int age_, String city_){

		//initialize
		this.name = name_;
		this.age = age_;
		this.city = city_;
	}

	// getters
	public String getName(){

		return this.name;
	}

	public int getAge(){

		return this.age;
	}

	public String getCity(){

		return this.city;
	}

	//setters

	public void setName(String newName) throws Exception{

		if (newName != null && !newName.isEmpty()){

			this.name = newName;
		} else{

			throw new Exception("name cannot be empty !");
		}
	}

	public void setAge(int newAge) throws Exception{

		if (age > 0){

			this.age = newAge;
		} else{

			throw new Exception("age must be greater than 0 !");
		}
	}

	public void setCity(String newCity) throws Exception{

		if (newCity != null && !newCity.isEmpty()){

			this.city = newCity;
		} else{

			throw new Exception("city cannot be empty !");
		}
	}

	// string metohod
	@Override
	public String toString(){

		String finalString = String.format("{name = %s, age = %d, city = %s}", this.name, this.age, this.city);

		return finalString;
	}
}