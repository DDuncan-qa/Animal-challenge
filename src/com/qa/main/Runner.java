package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		a.makeNoise();
		
		Penguin pingu = new Penguin();
		pingu.breathe();
		pingu.makeNoise();
		
		Whale whale = new Whale();
		whale.swim();
		EmperorPenguin king = new EmperorPenguin();
		king.makeNoise();
		
		pingu.swim();
		
		FlyingFish dave = new FlyingFish();   // Fish is implementing the swimable interface							
		dave.swim();						// because fish is implementing the swimable interface
											// and flying fish extends fish, fly fish gets that functionality
		
		dave.fly();
	}

}
