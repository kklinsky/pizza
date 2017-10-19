package org.klinsky.pizzatime.parser;

import org.klinsky.pizzatime.model.parser.NumberToken;
import org.klinsky.pizzatime.model.parser.WordToken;

public class NumberParser extends TokenParser {
	public WordToken parse(String str) {
		int value = 0;
		NumberToken token = new NumberToken();
		
		String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		// Check for a simple digit value
		try {
			value = Integer.parseInt(str);
			token.setValue(value);
			return token;
		} catch (NumberFormatException nfe) {
			
		}
		
		// Check for a spelled out number
		String wordStr = str.toLowerCase();
		for (int i=0; i<numbers.length; i++) {
			if (numbers[i].equals(wordStr)) {
				token.setValue(i);
				return token;
			}
		}
		
		return null;
	}
}
