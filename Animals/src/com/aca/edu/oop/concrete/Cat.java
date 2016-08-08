package com.aca.edu.oop.concrete;

import com.aca.edu.oop.abstracts.Mammal;

public class Cat extends Mammal {

	public Cat(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	@Override
	public void feedMilkToChild() {
		System.out.println("-MRRRRRR " + "\n nyam nyam");
	}

	@Override
	public String froots() {
		return "meet,bread";
	}

	@Override
	public int avgCountOfPups() {
		return 3;
	}

}
