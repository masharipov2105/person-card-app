package com.masharipov2105.systems.models;

public class RequestModel{

	// fields
	private String name;
	private int age;
	private String city;

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