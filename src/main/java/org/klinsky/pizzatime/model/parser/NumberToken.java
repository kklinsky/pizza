package org.klinsky.pizzatime.model.parser;

public class NumberToken extends ModifierToken {
	private int value;
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public String toString() {
		return "NumberToken("+value+")";
	}
}
