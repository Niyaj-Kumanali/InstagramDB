package doa;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;
import entity.Order;

public interface SwiggyRepo {
	LinkedHashMap<Integer, Order> custOrders = new LinkedHashMap<>();
	ArrayList<Customer> customers = new ArrayList<>();

	String[] vegFoods = { "Panner Tikka.", "Manchoorian.", "Kashmiri Pulav.", "Garlic Noodles", "Masoor Dal.", "Tadka.",
			"Wild Mushroom Risotto", "Pasta", "Garlic Naan", "Butter Naan" };

	String[] drinks = { "Lemon Soda", "Orange Juice.", "cold coffee", "Garlic Tea", "Mojito", "Old Monk",
			"Black Bacardi", "Antiquity", "Teachers", "Chilled Beer" };

	String[] nonVegFoods = { "Chicken Tikka", "Biryani", "Chicken Noodles", "Chicken Soup", "Kabab", "Chicken Rolls",
			"Garlic Naan", "Butter Naan", "Keema Chapati", "Keema Balls" };

}
