package com.aca.edu.oop.concrete;


import com.aca.edu.oop.abstracts.ResidentBird;

public class Sparrow extends ResidentBird {

	public Sparrow(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	@Override
	public void fly() {
		System.out.println("I fly not so long");
	}

	@Override
	public  String froots() {
		return "worm,grains";
	}

	@Override
	public int avgCountOfPups() {
		return 4;
	}

}
