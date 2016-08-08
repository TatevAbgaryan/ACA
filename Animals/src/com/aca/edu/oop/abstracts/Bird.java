package com.aca.edu.oop.abstracts;

public abstract class Bird extends Animal {
	
	public Bird(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	public abstract void fly();
}
