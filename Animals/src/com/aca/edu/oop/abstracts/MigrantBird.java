package com.aca.edu.oop.abstracts;

public abstract class MigrantBird extends Bird {

	private int flyDistance;

	public MigrantBird(String color, boolean isWild, boolean isPredatory, int age, float weight) {
		super(color, isWild, isPredatory, age, weight);
	}

	public MigrantBird(String color, boolean isWild, boolean isPredatory, int age, float weight, int flyDistance) {
		super(color, isWild, isPredatory, age, weight);
		this.flyDistance = flyDistance;
	}

	public int getFlyDistance() {
		return flyDistance;
	}

	public void setFlyDistance(int flyDistance) {
		this.flyDistance = flyDistance;
	}

}
