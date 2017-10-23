package org.klinsky.pizzatime.util;

import java.util.List;

import org.klinsky.pizzatime.model.Topping;

public class EnglishConcatinator {
	
	public static String concat(List<Topping> toppings) {
		String separator = "";
		
		if (toppings.size() == 1) {
			return toppings.get(0).getName();
		} else if (toppings.size() == 0) {
			return "";
		} else if (toppings.size() > 2) {
			separator = ",";
		}
		
		StringBuilder strBuilder = new StringBuilder();
		for (int i=0; i<toppings.size(); i++) {
			if (i == toppings.size() - 1) {
				strBuilder.append("and "+toppings.get(i).getName());
			} else {
				strBuilder.append(toppings.get(i).getName() + separator + " ");
			}
		}
		return strBuilder.toString();
	}
	
	/*
	public static String concat(List<String> items) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i=0; i<items.size(); i++) {
			if (i == items.size() - 1) {
				strBuilder.append(items.get(i) + ", ");
			} else {
				strBuilder.append(items.get(i) + ", ");
			}
		}
		return strBuilder.toString();
	}
	*/
}
