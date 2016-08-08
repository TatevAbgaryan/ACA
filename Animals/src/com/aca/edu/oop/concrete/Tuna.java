package com.aca.edu.oop.concrete;

import com.aca.edu.oop.abstracts.Fish;

public class Tuna extends Fish {

	public Tuna(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	@Override
	public void swim() {
		System.out.println("bl bl bl bllll... ");
	}

	@Override
	public String froots() {
		return "uf chgitem";
	}

	@Override
	public int avgCountOfPups() {
		return 12;
	}

}
