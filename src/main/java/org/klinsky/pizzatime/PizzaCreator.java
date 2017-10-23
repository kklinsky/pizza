package org.klinsky.pizzatime;

import java.util.ArrayList;
import java.util.Random;

import org.klinsky.pizzatime.model.Pizza;
import org.klinsky.pizzatime.model.Topping;

public class PizzaCreator {
	private ArrayList<Topping> toppings = new ArrayList<Topping>();
	
	
	public PizzaCreator() {
		
	}
	
	public void addTopping(Topping topping) {
		toppings.add(topping);
	}
	
	public Pizza createPizza(int toppingCount) {
		return createPizza(toppingCount, toppings);
	}
	
	public Pizza createPizza(int toppingCount, ArrayList<Topping> toppings) {
		Pizza pizza = new Pizza();
		pizza.add(new Topping("cheese"));
		
		shuffleToppings(toppings);
		
		for (int i=0; i<toppingCount; i++) {
			pizza.add(toppings.get(i));
		}
		
		return pizza;
	}
	
	public void shuffleToppings(ArrayList<Topping> toppings) {
		Random rand = new Random();
		
		for (int i=0; i<toppings.size()* 2; i++) {
			int index1 = rand.nextInt(toppings.size());
			int index2 = rand.nextInt(toppings.size());
			
			Topping tempTopping = toppings.get(index1);
			toppings.set(index1, toppings.get(index2));
			toppings.set(index2, tempTopping);
		}
	}
	
	public static void main(String[] args) {
		PizzaCreator creator = new PizzaCreator();
		creator.addTopping(new Topping("cheese"));
		creator.addTopping(new Topping("pepperoni"));
		creator.addTopping(new Topping("sausage"));
		creator.addTopping(new Topping("olives"));
		creator.addTopping(new Topping("spinach"));
		creator.addTopping(new Topping("mushrooms"));
		creator.addTopping(new Topping("banana peppers"));
		creator.addTopping(new Topping("meatball"));
		creator.addTopping(new Topping("onions"));
		creator.addTopping(new Topping("artichokes"));
		creator.addTopping(new Topping("peppers"));
		creator.addTopping(new Topping("sweet peppers"));
		creator.addTopping(new Topping("basil"));
		creator.addTopping(new Topping("tomatoes"));
		
		
		
		Pizza pizza;
		for (int i=0; i<10; i++) {
			pizza = creator.createPizza(3);
			System.out.println(pizza.getToppingsDescription());
		}
	}
}
