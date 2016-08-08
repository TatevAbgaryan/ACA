package com.aca.edu.oop.main;

import com.aca.edu.oop.abstracts.Animal;
import com.aca.edu.oop.concrete.Cat;
import com.aca.edu.oop.concrete.Sparrow;
import com.aca.edu.oop.concrete.Swallow;
import com.aca.edu.oop.concrete.Tuna;

public class LiveAnimals {

	public static void main(String[] args) {
		Animal animals[] = new Animal[4];
		Cat cat = new Cat("rizhik", false, false, 1, 0.7f);
		Sparrow sparrow = new Sparrow("brown", true, false, 4, 0.5f);
		Swallow swallow = new Swallow("black", true, false, 2, 0.4f);
		Tuna tuna = new Tuna("blue", true, false, 1, 1.3f);
		animals[0] = sparrow;
		animals[1] = swallow;
		animals[2] = cat;
		animals[3] = tuna;
		
		for (int i = 0; i < animals.length; i++) {
			System.out.println("I am " + animals[i].getClass().getSimpleName() + " I eat " + animals[i].froots());
			System.out.println("I am " + animals[i].getClass().getSimpleName() + " I usually I born " + animals[i].avgCountOfPups() + " pups");
		}
	}
}
