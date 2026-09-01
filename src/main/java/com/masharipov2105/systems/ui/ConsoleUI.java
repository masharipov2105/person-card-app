package com.masharipov2105.systems.ui;

import com.masharipov2105.systems.services.CardService;
import com.masharipov2105.systems.services.CardServiceImpl;
import com.masharipov2105.systems.storage.CardStorage;
import java.util.Scanner;

public class ConsoleUI{

	private CardStorage cardStorage;
	private CardServiceImpl cardService;
	private Scanner scanner;
	private Boolean run = true;

	private String menu = 
	    "\n====================================\n" + 
	    "=        Personal Card App         =\n" + 
	    "====================================\n" +
	    "=========== MENU ===========\n" +
	    "1.📋 Show menu\n" +
	    "2.➕ Create Card\n" +
	    "3.👁️ View Card\n" + 
	    "4.✏️ Edit name\n" +
	    "5.✏️ Edit age\n" + 
	    "6.✏️ Edit city\n" + 
	    "7. Delete card\n" + 
	    "8. Exit app\n";

	private String commandError = "Command not found, please enter 1";

	public ConsoleUI(CardStorage storage){

		this.cardService = new CardServiceImpl(storage);
		this.scanner = new Scanner(System.in);

		System.out.println(menu);
	}

	public void start(){

		while (this.run){

			System.out.print("Command: ");
			String command = this.scanner.nextLine();

			switch(command){

				case "1":
					System.out.println(this.menu);
					break;

				case "2":
					try{
						createCard();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}

				case "3":
					try{
						viewCard();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}
					

				case "4":
					try{
						editName();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}
				case "5":
					try{
						editAge();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}
				case "6":
					try{
						editCity();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}

				case "7":
					try{
						deleteCard();
						break;
					} catch(Exception e){
						System.out.println(e.getMessage());
					}
				case "8":
					System.out.println("Bye .");
					this.run = false;
					break;

				default:
					System.out.println(commandError);
			}
		}
	}

	public void createCard() throws Exception{

		try{

			Scanner s = new Scanner(System.in);

			String name_;
			int age_ = 0;
			String city_;

			System.out.print("enter name: ");
			name_ = s.nextLine();

			System.out.print("enter Age: ");
			try{
				age_ = Integer.valueOf(s.nextLine());
			} catch(Exception e){
				System.out.println("the value of age must be a number");
				createCard();
			}
			System.out.print("enter city: ");
			city_ = s.nextLine();

			cardService.createCard(name_, age_, city_);
			System.out.println("Card created successfully !");
		} catch(Exception e){

			System.out.println(e.getMessage());
		}
	}

	public void viewCard() throws Exception{

		System.out.println(cardService.viewCard());
	}

	public void editName() throws Exception{

		String name_;
		try{

			Scanner s = new Scanner(System.in);
			System.out.print("enter new name: ");
			name_ = s.nextLine();
			cardService.updateName(name_);
			System.out.println("Name successfully updated !");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void editAge() throws Exception{

		int age_ = 0;

		try{
			Scanner s = new Scanner(System.in);
			System.out.print("enter new age: ");
			age_ = Integer.valueOf(s.nextLine());
		} catch(Exception e){
			
			System.out.println("the value of age must be a number !");
		}
		try{

			cardService.updateAge(age_);
			System.out.println("Age successfully updated !");
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void editCity() throws Exception{

		String city_;
		try{

			Scanner s = new Scanner(System.in);
			System.out.print("enter new city: ");
			city_ = s.nextLine();
			cardService.updateCity(city_);
			System.out.println("City successfully updated !");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public void deleteCard() throws Exception{

		Scanner s = new Scanner(System.in);

		System.out.print("Are you sure you want to delete the card?(y/n) ");

		if (s.nextLine().equalsIgnoreCase("y")){
			cardService.deleteCard();
			System.out.println("Card successfully deleted !");
		} else{
			System.out.println("Aborted.");
		}
	}
}