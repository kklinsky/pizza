package org.klinsky.pizzatime.model;

import java.util.ArrayList;

import org.klinsky.pizzatime.util.EnglishConcatinator;

public class Pizza {
	private ArrayList<Topping> toppings = new ArrayList<Topping>();
	private Recipe recipe;
	
	public Pizza() {
	
	}
	
	public void add(Topping topping) {
		toppings.add(topping);
	}
	
	public String getToppingsDescription() {
		StringBuilder strBuilder = new StringBuilder();
		ArrayList<Topping> remainingToppings = new ArrayList<Topping>();
		
		int cheeseCount = 0;
		for (Topping topping: toppings) {
			if ("cheese".equals(topping.getName())) {
				cheeseCount++;
			} else {
				remainingToppings.add(topping);
			}
		}
		
		if (remainingToppings.size() == 0) {
			if (cheeseCount > 0) {
				strBuilder.append("cheese");
			}
		} else {
			strBuilder.append(EnglishConcatinator.concat(remainingToppings));
		}

		strBuilder.append(" pizza");
		
		if (cheeseCount == 0) {
			strBuilder.append(" without cheese");			
		} else if (cheeseCount > 1) {
			strBuilder.append(" with extra cheese");
		}

		return strBuilder.toString();
	}
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
		pizza.add(new Topping("cheese"));
		pizza.add(new Topping("cheese"));
		pizza.add(new Topping("pepperoni"));
		pizza.add(new Topping("mushroom"));
		//pizza.add(new Topping("olive"));
		System.out.println(pizza.getToppingsDescription());
	}
}
