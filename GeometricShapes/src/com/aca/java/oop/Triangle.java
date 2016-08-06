package com.aca.java.oop;

import java.awt.*;

/**
 * Created by tabgarya on 8/4/2016.
 */
public class Triangle extends Shape {
	private int side1;
	private int side2;
	private int side3;

	public Triangle(int side1, int side2, int side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}

	public int getSide3() {
		return side3;
	}

	@Override
	public double getArea() {
		int p = (side1 + side2 + side3) / 2;
		return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
	}
}
