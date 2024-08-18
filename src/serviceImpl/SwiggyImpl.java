package serviceImpl;

import doa.SwiggyRepo;
import java.util.Scanner;

import entity.Customer;
import entity.Order;
import service.Swiggy;

public class SwiggyImpl implements Swiggy, SwiggyRepo {

	private Scanner sc = new Scanner(System.in);

	private Customer currentCustomer = null;

	@Override
	public void foodMenu() {
		System.out.println("\n****** FOOD MENU *******");
		System.out.println("________________________");
		System.out.println("1. Veg Food");
		System.out.println("2. Non-veg Food");
		System.out.println("3. Buy Drinks");
		System.out.println("4. Exit");
		System.out.print("Enter your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1:
			vegFoodMenu();
			break;
		case 2:
			nonVegFoodMenu();
			break;
		case 3:
			drinksMenu();
			break;
		case 4:
			System.exit(0);
		default:
			foodMenu();
		}
	}

	@Override
	public void cancelOrder() {
		System.out.println("\nYour order is cancelled\n");
		currentCustomer.setOrder(null);
		foodMenu();
	}

	private void vegFoodMenu() {
		boolean flag = false;

		int foods = vegFoods.length;
		while (true) {
			System.out.println("\n\n\t******* Veg Food Menu *******");
			for (int i = 0; i < vegFoods.length; i++) {
				System.out.println((i + 1) + ". " + vegFoods[i]);
			}
			System.out.println((foods + 1) + ". Buy Non-Veg");
			System.out.println((foods + 2) + ". Buy Drinks.");
			System.out.println((foods + 3) + ". Go to cart.");
			System.out.println((foods + 4) + ". Cancel order & Exit.");

			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				addFood(vegFoods[0]);
				break;
			case 2:
				addFood(vegFoods[1]);
				break;
			case 3:
				addFood(vegFoods[2]);
				break;
			case 4:
				addFood(vegFoods[3]);
				break;
			case 5:
				addFood(vegFoods[4]);
				break;
			case 6:
				addFood(vegFoods[5]);
				break;
			case 7:
				addFood(vegFoods[6]);
				break;
			case 8:
				addFood(vegFoods[7]);
				break;
			case 9:
				addFood(vegFoods[8]);
				break;
			case 10:
				addFood(vegFoods[9]);
				break;
			case 11:
				nonVegFoodMenu();
				break;
			case 12:
				drinksMenu();
				break;
			case 13:
				flag = true;
				myCart();
				break;
			case 14:
				cancelOrder();
				sc.close();
				System.exit(0);
			default:
				foodMenu();
			}
			if (flag) {
				break;
			}
		}
	}

	private void nonVegFoodMenu() {
		boolean flag = false;

		while (true) {
			System.out.println("\n\n\t*******Non Veg Food Menu *******");
			for (int i = 0; i < nonVegFoods.length; i++) {
				System.out.println((i + 1) + ". " + nonVegFoods[i]);
			}
			System.out.println((nonVegFoods.length + 1) + ". Buy Veg");
			System.out.println((nonVegFoods.length + 2) + ". Buy Drinks.");
			System.out.println((nonVegFoods.length + 3) + ". Go to cart.");
			System.out.println((nonVegFoods.length + 4) + ". Cancel order & Exit.");

			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				addFood(nonVegFoods[0]);
				break;
			case 2:
				addFood(nonVegFoods[1]);
				break;
			case 3:
				addFood(nonVegFoods[2]);
				break;
			case 4:
				addFood(nonVegFoods[3]);
				break;
			case 5:
				addFood(nonVegFoods[4]);
				break;
			case 6:
				addFood(nonVegFoods[5]);
				break;
			case 7:
				addFood(nonVegFoods[6]);
				break;
			case 8:
				addFood(nonVegFoods[7]);
				break;
			case 9:
				addFood(nonVegFoods[8]);
				break;
			case 10:
				addFood(nonVegFoods[9]);
				break;
			case 11:
				vegFoodMenu();
				break;
			case 12:
				drinksMenu();
				break;
			case 13:
				flag = true;
				myCart();
				break;
			case 14:
				cancelOrder();
				sc.close();
				System.exit(0);
			default:
				foodMenu();
			}
			if (flag) {
				break;
			}
		}

	}

	private void drinksMenu() {
		boolean flag = false;

		while (true) {
			System.out.println("\n\n\t******* Drinks Menu *******");
			for (int i = 0; i < drinks.length; i++) {
				System.out.println((i + 1) + ". " + drinks[i]);
			}
			System.out.println((drinks.length + 1) + ". Buy Non-Veg");
			System.out.println((drinks.length + 2) + ". Buy Veg.");
			System.out.println((drinks.length + 3) + ". Go to cart.");
			System.out.println((drinks.length + 4) + ". Cancel order & Exit.");

			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				addDrinks(drinks[0]);
				break;
			case 2:
				addDrinks(drinks[1]);
				break;
			case 3:
				addDrinks(drinks[2]);
				break;
			case 4:
				addDrinks(drinks[3]);
				break;
			case 5:
				addDrinks(drinks[4]);
				break;
			case 6:
				addDrinks(drinks[5]);
				break;
			case 7:
				addDrinks(drinks[6]);
				break;
			case 8:
				addDrinks(drinks[7]);
				break;
			case 9:
				addDrinks(drinks[8]);
				break;
			case 10:
				addDrinks(drinks[9]);
				break;
			case 11:
				nonVegFoodMenu();
				break;
			case 12:
				vegFoodMenu();
				break;
			case 13:
				flag = true;
				myCart();
				break;
			case 14:
				cancelOrder();
				sc.close();
				System.exit(0);
			default:
				foodMenu();
			}
			if (flag) {
				break;
			}
		}

	}

	@Override
	public void myCart() {
		Order ord = currentCustomer.getOrder();
		double amount = 0;
		System.out.print("\nFoods : \n");
		if (ord.getFood().size() != 0) {
			int i = 1;
			for (String food : ord.getFood()) {
				System.out.print(food + "" + fillSpaces(food));
				amount += 100;
				if (i % 3 == 0) {
					System.out.println();
				}
				i++;
			}
		} else {
			System.out.print("No food added");
		}
		System.out.print("\nDrinks : \n");
		if (ord.getDrinks().size() != 0) {
			int i = 1;
			for (String drink : ord.getDrinks()) {
				System.out.print(drink + "" + fillSpaces(drink));
				amount += 50;
				if (i % 3 == 0) {
					System.out.println();
				}
				i++;
			}
		} else {
			System.out.println("No drinks added");
		}
		System.out.println("\nBill Amount : " + amount);
		System.out.print("\nConfirm Order : ");
		char ch = sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		if (ch == 'y') {
			System.out.println("Enter your doorno : ");
			currentCustomer.getAddress().setDoorno(sc.nextLine());
			System.out.println("Enter your street : ");
			currentCustomer.getAddress().setStreet(sc.nextLine());
			System.out.println("Enter your city : ");
			currentCustomer.getAddress().setCity(sc.nextLine());
			System.out.println("Enter your pin code : ");
			currentCustomer.getAddress().setPincode(sc.nextInt());
			myBill(amount);
		} else {
			cancelOrder();
		}

	}

	@Override
	public void myBill(double amount) {
		System.out.print("Enter the amount to confirm order : ");
		double receivedAmt = sc.nextDouble();
		sc.nextLine();
		if (amount == receivedAmt) {
			System.out.println("Order is confirmed");
			custOrders.put(currentCustomer.getID(), currentCustomer.getOrder());
			System.out.println("Order is shipped to " + currentCustomer.getAddress());
		} else {
			System.err.println("Insuffiecient amount");
			System.out.println("Do you want to cancel the order? (y/n)");
			char ch = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			if (ch == 'n') {
				myBill(amount);
			} else {
				cancelOrder();
			}
		}

	}

	@Override
	public void addFood(String food) {
		currentCustomer.getOrder().addFood(food);
	}

	public void addDrinks(String drink) {
		currentCustomer.getOrder().addDrink(drink);
	}

	String fillSpaces(String str) {
		String spaces = "";
		for (int i = 0; i < 23 - str.length(); i++) {
			spaces += " ";
		}
		return spaces;
	}

	@Override
	public void signUp() {
		System.out.println("\tSign Up");
		System.out.print("Enter Name : ");
		String name = sc.nextLine();

		System.out.print("Enter your age :");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter your phone number: ");
		long phone = sc.nextLong();
		sc.nextLine();

		System.out.print("Enter your email: ");
		String email = sc.next();
//		sc.nextLine();

		System.out.print("Enter your password: ");
		String password = sc.next();
//		sc.nextLine();

		currentCustomer = new Customer(name, age, phone, email, password);
		customers.add(currentCustomer);

		System.out.println("\n\n******User created successfully*******");

		foodMenu();

	}

//	@Override
//	public void login() {
//		System.out.print("Enter your phone number or email : ");
//		String input = sc.next();
//		String email = null;
//		long phone = 0;
//		if (input.matches("[0-9]*")) {
//			phone = Long.parseLong(input);
//		} else if (input.matches("@gmail.com")) {
//			email = input;
//		}
//
//		System.out.print("Enter your password: ");
//		String password = sc.next();
//		if (currentCustomer != null) {
//			if ((currentCustomer.getEmail().equalsIgnoreCase(email) || currentCustomer.getPhone() == phone)
//					&& currentCustomer.getPassword().equals(password)) {
//				System.out.println("Login Successfull");
//				foodMenu();
//			} else {
//				System.err.println("Invalid email or phone number or password");
//			}
//		} else {
//			System.out.println("User does not exits");
//			System.out.println("Do you want to sign up instead? (y/n)");
//			char ch = sc.next().toLowerCase().charAt(0);
//			sc.nextLine();
//			if (ch == 'y') {
//				signUp();
//			} else {
//				System.exit(0);
//			}
//		}
//	}

}
