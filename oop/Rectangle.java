package com.aca.java.oop;

import java.awt.*;

/**
 * Created by tabgarya on 8/4/2016.
 */
public class Rectangle extends Shape {

	private int lenght;
	private int width;

	public Rectangle(int width, int lenght) {
		this.lenght = lenght;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public double getArea() {
		return lenght * width;
	}
}
