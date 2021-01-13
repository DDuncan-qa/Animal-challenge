package com.qa.main;

public class Bird extends Animal implements Flyable{

	protected int age = 4;
	protected String size = "Small";
	protected int weight = 10000;
	
	@Override
	public void makeNoise() {
		System.out.println("flap flap");
		
	}

	@Override
	public void fly() {
		System.out.println("Flap flap");
		
	}
	

}
