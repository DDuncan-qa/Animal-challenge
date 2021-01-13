package com.qa.main;



public abstract class Fish implements Swimable {
	
	protected int age = 1;
	protected String size = "Small";
	protected int weight = 100;
	
	public abstract void breatheWater();

	// methods that come from an interface
	// don't need to be implemented with
	// base functionality 
	// but the can be if you like
	// -> see below:
	
	
	
	public void swim() {
		System.out.println("i have fins woo");
	}
}
