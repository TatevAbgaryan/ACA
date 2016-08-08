package com.aca.edu.oop.abstracts;

public abstract class Animal {

	public Animal(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super();
		this.color = color;
		this.isWild = isWild;
		this.isPredatory = isPredatory;
		this.age = age;
		this.weight = weight;
	}

	private String color;
	private boolean isWild;
	private boolean isPredatory;
	private int age;
	private float weight;

	public abstract String froots();

	public abstract int avgCountOfPups();

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public boolean isWild() {
		return isWild;
	}

	public boolean isPredatory() {
		return isPredatory;
	}

	public int getAge() {
		return age;
	}

	public void icreaseAge() {
		this.age++;
	}
}
