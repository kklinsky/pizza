package org.klinsky.pizzatime.model.parser;

public class UnknownToken extends WordToken {
	private String value;

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public String toString() {
		return "UnknownToken("+value+")";
	}
}
