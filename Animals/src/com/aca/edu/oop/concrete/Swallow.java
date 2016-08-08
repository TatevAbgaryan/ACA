package com.aca.edu.oop.concrete;

import com.aca.edu.oop.abstracts.MigrantBird;

public class Swallow extends MigrantBird {

	public Swallow(String color, boolean isWild, boolean isPredatory, int age, float weight, int flyDistance) {
		super(color, isWild, isPredatory, age, weight, flyDistance);
	}

	public Swallow(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("I can fly too long...");
	}

	@Override
	public String froots() {
		return "seeds,greens";
	}

	@Override
	public int avgCountOfPups() {
		return 6;
	}

}
