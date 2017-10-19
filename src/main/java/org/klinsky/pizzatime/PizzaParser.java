package org.klinsky.pizzatime;

import java.util.ArrayList;

import org.klinsky.pizzatime.model.parser.NumberToken;
import org.klinsky.pizzatime.model.parser.UnknownToken;
import org.klinsky.pizzatime.model.parser.WordToken;
import org.klinsky.pizzatime.parser.NumberParser;
import org.klinsky.pizzatime.parser.TokenParser;
import org.klinsky.pizzatime.parser.ToppingParser;

public class PizzaParser {
	private ArrayList<TokenParser> tokenParserList = new ArrayList<TokenParser>();
	
	public PizzaParser() {
		initParsers();
	}
	
	public ArrayList<WordToken> parse(String str) {
		ArrayList<WordToken> sentence = new ArrayList<WordToken>();
		String[] parts = str.split("\\s+");
		WordToken token = null;
		for (String word : parts) {
			for (TokenParser tokenParser: tokenParserList) {
				token = tokenParser.parse(word);
				if (token != null) {
					sentence.add(token);
					break;
				}
			}
			if (token == null) {
				UnknownToken unknownToken = new UnknownToken();
				unknownToken.setValue(word);
				sentence.add(unknownToken);
			}
		}
		return sentence;
	}

	public void initParsers() {
		tokenParserList.add(new NumberParser());
		tokenParserList.add(new ToppingParser());
	}

	public static void main(String[] args) {
		String sample = "Three topping pizza";
		PizzaParser parser = new PizzaParser();
		ArrayList<WordToken> sentence = parser.parse(sample);
		
		System.out.println(sample);
		for (WordToken token: sentence) {
			System.out.println(token);
		}
	}
}
