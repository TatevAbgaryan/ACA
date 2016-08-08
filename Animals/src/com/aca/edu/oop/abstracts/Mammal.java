package com.aca.edu.oop.abstracts;

public abstract class Mammal extends Animal {
	private boolean isHerbivore;
	private boolean isCarnivore;

	public Mammal(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	public abstract void feedMilkToChild();

	public boolean isHerbivore() {
		return isHerbivore;
	}

	public void setHerbivore(boolean isHerbivore) {
		this.isHerbivore = isHerbivore;
	}

	public boolean isCarnivore() {
		return isCarnivore;
	}

	public void setCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
	}
}
