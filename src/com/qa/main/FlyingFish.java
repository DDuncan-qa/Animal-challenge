package com.qa.main;

public class FlyingFish extends Fish implements Flyable {

	@Override
	public void breatheWater() {
	System.out.println("Flying and breathing water is my thing!");
		
	}

	@Override
	public void swim() {
		System.out.println("glub glub");
		
	}

	@Override
	public void fly() {
		System.out.println("Weeeeee");
	}

}
