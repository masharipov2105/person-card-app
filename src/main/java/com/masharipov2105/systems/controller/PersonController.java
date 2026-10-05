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

					show();
					break;

				case "update":

					update();
					break;

				case "del":

					delete();
					break;

				case "help":

					help();
					break;

				case "exit":

					System.out.println("\nGoodbye. \n");
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

		String name = "", city = "";
		int age = 0;

		boolean run_ = true;

		System.out.println("\n=== Create new Person card ===\n");

		if (this.service.readCard() != null){

			System.out.println("The card has already been created.\n");
		} else{

			System.out.println("It can be cancelled with 'done'.\n");

			while (run_){

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

				if (data.trim().equals("done")){

					run_ = false;
					break;
				}

				name = data.trim();
				break;
			}

			while(run_){

				System.out.print("enter age: ");
				String data = this.scanner.nextLine();

				if (data == null || data.trim().isEmpty()){

					System.out.println("The age cannot be empty.");
					continue;
				}

				if (data.trim().equals("done")){

					run_ = false;
					break;
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


			while (run_){

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

				if (data.trim().equals("done")){

					run_ = false;
					break;
				}
				if (data.trim().length() >= 30){

					System.out.println("The maximum length of the city name is 30");
					continue;
				}

				city = data.trim();
				break;
			}

			if (run_){

				RequestModel model = new RequestModel();
				model.setName(name);
				model.setAge(age);
				model.setCity(city);

				try{
					
					this.service.createCard(model);
					System.out.println("\nPerson card created !\n");
				} catch(Exception e){

					System.out.println(e.getMessage());
				}
			} else{

				System.out.println("\nAborted.\n");
			}
		}
	}

	private void show(){

		System.out.println("\n=== Person Card Data ===\n");

		if (this.service.readCard() == null){

			System.out.println("Empty.\n");
		} else{

			System.out.println(this.service.readCard().toString() + "\n");
		}
	}

	private void update(){

		String name = "", city = "";
		int age = 0;

		boolean run_ = true;

		System.out.println("\n=== Update Person card data ===\n");
		System.out.println("It can be cancelled with 'done'.\n");

		if (this.service.readCard() == null){

			System.out.println("The person card has not yet been created.\n");
		} else{

			System.out.println("Current status: " + this.service.readCard().toString() + "\n");

			while (run_){

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

				if (data.trim().equals("done")){

					run_ = false;
					break;
				}

				name = data.trim();
				break;
			}

			while(run_){

				System.out.print("enter age: ");
				String data = this.scanner.nextLine();

				if (data == null || data.trim().isEmpty()){

					System.out.println("The age cannot be empty.");
					continue;
				}

				if (data.trim().equals("done")){

					run_ = false;
					break;
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


			while (run_){

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

				if (data.trim().equals("done")){

					run_ = false;
					break;
				}
				if (data.trim().length() >= 30){

					System.out.println("The maximum length of the city name is 30");
					continue;
				}

				city = data.trim();
				break;
			}

			if (run_){

				RequestModel model = new RequestModel();
				model.setName(name);
				model.setAge(age);
				model.setCity(city);

				try{
					
					this.service.updateCard(model);
					System.out.println("\nPerson card updated !\n");
				} catch(Exception e){

					System.out.println(e.getMessage());
				}
			} else{

				System.out.println("\nAborted.\n");
			}
		}
	}

	private void delete(){

		System.out.println("\n=== Delete Person card ===\n");

		if (this.service.readCard() == null){

			System.out.println("Person card does not exist.\n");
		} else{

			while(true){

				System.out.print("Do you really want to delete it? (y/n): ");
				String data = this.scanner.nextLine();

				if (data == null || data.trim().isEmpty()){

					continue;
				}

				if (data.trim().equals("y")){

					try{

						this.service.deleteCard();
						System.out.println("\n Person card deleted.\n");
						break;
					} catch(Exception e){

						System.out.println(e.getMessage() + "\n");
						break;
					}
				}

				if (data.trim().equals("n")){

					System.out.println("\nAborted.\n");
					break;
				}

				System.out.println("Please enter y or n");
				continue;
			}
		}
	}

	private void help(){

		System.out.println("\n=== All commands menu ===\n");
		System.out.println(help);
	}
}