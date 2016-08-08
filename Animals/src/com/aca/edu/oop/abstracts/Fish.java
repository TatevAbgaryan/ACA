package com.aca.edu.oop.abstracts;

public abstract class Fish extends Animal {
	
	public abstract void swim();

	public Fish(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

}
