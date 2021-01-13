package com.qa.main;

public class Whale extends Animal implements Swimable {

	@Override
	public void makeNoise() {
		System.out.println("Splash");
		
	}

	@Override
	public void swim() {
		System.out.println("Splish");
		
	}
	

}
