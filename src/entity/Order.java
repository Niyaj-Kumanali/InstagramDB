package entity;

import java.util.ArrayList;

public class Order {
	private ArrayList<String> foodList = new ArrayList<String>();
	private ArrayList<String> drinkList = new ArrayList<String>();

	public ArrayList<String> getFood() {
		return foodList;
	}

	public ArrayList<String> getDrinks() {
		return drinkList;
	}

	public void addFood(String food) {
		foodList.add(food);
		System.out.println(food + " added to successfully");
	}
	
	public void addDrink(String drink) {
		drinkList.add(drink);
		System.out.println(drink + " added to successfully");
	}

	public void removeFood(String food) {
		if (!foodList.isEmpty()) {
			for (int i = 0; i < foodList.size(); i++) {
				if (foodList.get(i).equals(food)) {
					foodList.remove(i);
				}
			}
		} else {
			System.out.println("Food cart is empty");
		}
	}
	
	public void removeDrink(String drink) {
		if (!drinkList.isEmpty()) {
			for (int i = 0; i < drinkList.size(); i++) {
				if (drinkList.get(i).equals(drink)) {
					drinkList.remove(i);
				}
			}
		} else {
			System.out.println("Drink cart is empty");
		}
	}
	

}
