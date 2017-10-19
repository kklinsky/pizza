package org.klinsky.pizzatime.parser;

import org.klinsky.pizzatime.model.parser.ToppingToken;
import org.klinsky.pizzatime.model.parser.WordToken;

public class ToppingParser extends TokenParser {
	private String[] matchStrings = {"topping", "toppings"};
	
	@Override
	public WordToken parse(String str) {
		ToppingToken topping = new ToppingToken();
		String lowerStr = str.toLowerCase();
		for (String criteria: matchStrings) {
			if (criteria.equals(lowerStr)) {
				return topping;
			}
		}
		return null;
	}

}
