package org.klinsky.pizzatime.model;

import java.util.ArrayList;

public class Topping {
	private String name;
	private ArrayList<ModifierModel> modifiers = new ArrayList<ModifierModel>();
	private boolean meat;
	private boolean cheese;
	
	public Topping(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMeat(boolean flag) {
		meat = flag;
	}
	
	public boolean isMeat() {
		return meat;
	}
	
	public void setCheese(boolean flag) {
		cheese = flag;
	}
	
	public boolean isCheese() {
		return cheese;
	}
}
