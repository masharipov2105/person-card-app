package com.masharipov2105.systems.controller;

import com.masharipov2105.systems.services.*;
import com.masharipov2105.systems.models.RequestModel;
import com.masharipov2105.systems.models.ResponseModel;

import java.util.Scanner;

public class PersonController{

	//fields;
	private CardService service;
	private Scanner scanner;

	private boolean run = true;

	private String banner = "\n======================================\n" +
	                          "==          Person Card App         ==\n" +
	                          "======================================\n";
	private String help = "add - create Person card\n" + 
	                      "show - show Person card data\n"+
	                      "update - update Person card data\n" +
	                      "del - delete Person card\n" + 
	                      "help - show commands menu\n" +
	                      "exit - close App\n";  

	//constructor
	public PersonController(CardService service){

		this.service = service;
		this.scanner = new Scanner(System.in);
	}

	public void start(){

		System.out.println(banner);
		System.out.println(help);

		while (run){

			System.out.print("Command: ");
			String data = this.scanner.nextLine();

			switch (data.trim()){

				case "add":

					add();
					break;

				case "show":

					System.out.println("select show command");
					break;

				case "update":

					System.out.println("select update command");
					break;

				case "del":

					System.out.println("select del command");
					break;

				case "help":

					System.out.println("select help command");
					break;

				case "exit":

					System.out.println("Goodbye. \n");
					run = false;
					break;

				case "":
					continue;

				default:

					System.out.println("Invalid command: " + data + " enter help");
					break;
			}
		}
	}

	private void add(){

		String name, city;
		int age;

		System.out.println("\n=== Create new Person card ===\n");

		while (true){

			System.out.print("enter name: ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The name cannot be empty.");
				continue;
			}

			if (data.trim().length() <= 2){

				System.out.println("The minimum length of the name is 3.");
				continue;
			}

			if (data.trim().length() >= 30){

				System.out.println("The maximum length of the name is 30");
				continue;
			}

			name = data.trim();
			break;
		}

		while(true){

			System.out.print("enter age: ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The age cannot be empty.");
				continue;
			}

			try{


				if (Integer.parseInt(data) < 18){

					System.out.println("Age cannot be under 18.");
					continue;
				}

				if (Integer.parseInt(data) >= 150){

					System.out.println("The age cannot exceed 150.");
					continue;
				}	

				age = Integer.parseInt(data);
				break;			
			} catch(Exception e){

				System.out.println(e.getMessage());
				continue;
			}
		}


		while (true){

			System.out.print("enter city: ");
			String data = this.scanner.nextLine();

			if (data == null || data.trim().isEmpty()){

				System.out.println("The name cannot be city.");
				continue;
			}

			if (data.trim().length() <= 2){

				System.out.println("The minimum length of the city name is 3.");
				continue;
			}

			if (data.trim().length() >= 30){

				System.out.println("The maximum length of the city name is 30");
				continue;
			}

			city = data.trim();
			break;
		}

		RequestModel model = new RequestModel();
		model.setName(name);
		model.setAge(age);
		model.setCity(city);

		try{
			
			this.service.createCard(model);
			System.out.println("Person card created !");
		} catch(Exception e){

			System.out.println(e.getMessage());
		}
	}
}