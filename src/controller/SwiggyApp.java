package controller;

import java.util.Scanner;

import service.Swiggy;
import serviceImpl.SwiggyImpl;

public class SwiggyApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Swiggy app = new SwiggyImpl();

		System.out.println("================== Welcome to swiggy ======================");
		System.out.println("___________________________________________________________");

		while (true) {
			System.out.println("\n1. Sign Up\n2. Exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				app.signUp();
				break;
			case 2:
				sc.close();
				System.exit(0);
			default:
				System.err.println("Invalid choice");
				break;
			}
		}

	}
}
