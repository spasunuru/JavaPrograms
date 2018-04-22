package com.pasunuru.scjp;

class Pizza {
	java.util.ArrayList toppings;

	public final void addTopping(String topping) {
		toppings.add(topping);
	}
}

public class PepperoniPizza extends Pizza {
	public void addTopping(String topping) {
		System.out.println("Cannot add Toppings");
	}

	public static void main(String[] args) {
		Pizza pizza = new PepperoniPizza();
		pizza.addTopping("Mushrooms");
	}
}
