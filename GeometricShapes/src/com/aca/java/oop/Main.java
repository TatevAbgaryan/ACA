package com.aca.java.oop;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];

		// initialize array somehow
		for (int i = 0; i < shapes.length; i++) {
			if (i % 3 == 0)
				shapes[i] = new Circle(i * 2 + 10);
			else if (i % 3 == 1)
				shapes[i] = new Rectangle(i + 10, 15 - i);
			else if (i % 3 == 2)
				shapes[i] = new Triangle(i * 3, i * 4, i * 5);
		}

		Arrays.sort(shapes);
		for (int i = 0; i < shapes.length; i++)
			System.out.println(shapes[i].getArea());
		
		Circle circle = new Circle(10);
		Circle circleCopy = circle;
		circleCopy.setRadius(5);
		System.out.println("Shalow copy circle.radius = " + circle.getRadius() + " circleCopy.radius = " + circleCopy.getRadius());

		Rectangle rectangle = new Rectangle(10, 20);
		Rectangle rectangleCopy;
		rectangleCopy = (Rectangle) rectangle.getClone();
		rectangleCopy.setLenght(5);
		System.out.println("Deep copy rectangle.lenght = " + rectangle.getLenght() + " rectangleCopy.lenght = "
				+ rectangleCopy.getLenght());

	}

	
	
	
	
	private static Shape[] bubbleSort(Shape[] array) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].getArea() > array[j + 1].getArea()) {
					Shape temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		for (int i = 0; i < array.length; i++)
			System.out.println(array[i].getArea());
		return array;
	}

	private static int binarySearch(Shape[] array, double area) {
		int end = array.length - 1;
		int start = 0;

		while (start <= end) {
			int midIndex = start + (end - start) / 2;
			if (array[midIndex].getArea() == area)
				return midIndex;
			if (array[midIndex].getArea() > area)
				end = midIndex - 1;
			else if (array[midIndex].getArea() < area)
				start = midIndex + 1;
		}
		return -1;
	}
}
