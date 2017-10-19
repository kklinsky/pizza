package org.klinsky.pizzatime.parser;

import org.klinsky.pizzatime.model.parser.WordToken;

public abstract class TokenParser {
	public abstract WordToken parse(String str);
}
