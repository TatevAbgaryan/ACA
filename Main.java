package com.aca.java.oop;

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

		shapes = bubbleSort(shapes);
		int[] array = {1,3,5,10,11,15};
		System.out.println(binarySearch(array, 16));
	}

	private static Shape[] bubbleSort(Shape[] array) {
		for (int i = 0; i < array.length - 1; i++)
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j].getArea() < array[j + 1].getArea()) {
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
			int midIndex = (end + start) / 2;
			if (array[midIndex].getArea() == area)
				return midIndex;
			if (array[midIndex].getArea() > area)
				end = midIndex;
			else if (array[midIndex].getArea() < area)
				start = midIndex;
		}
		return -1;
	}
	private static int binarySearch(int[] array, int element) {
        int end = array.length-1;
        int start = 0;

        while (start<= end) {
            int midIndex = (end + start) / 2;
            if (array[midIndex] == element)
                return midIndex;
            if (array[midIndex] > element)
                end = midIndex;
            else if (array[midIndex] < element)
                start = midIndex;
        }
        return -1;
    }
}
