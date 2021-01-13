package com.qa.main;

public class Penguin extends Animal implements Swimable {

	
	protected int age = 5;
	protected String size = "Medium";
	protected int weight = 100000;
	
	@Override
	public void makeNoise() {
		System.out.println("Tap tap");
		
	}
	
	@Override
	public void swim() { // Must implement Swimable
		System.out.println("Pingu does a swim");
		
	}

}
