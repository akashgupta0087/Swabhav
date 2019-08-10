package com.swabhav.human.test;

import com.swabhav.human.GenderCategory;
import com.swabhav.human.Human;

public class HumanTest {
	public static void main(String[] args) {

		Human human1 = new Human("Sachin", GenderCategory.MALE, 45, 1.65f, 65);
		print(human1);

		Human human2 = new Human("Virat", GenderCategory.MALE, 30);
		print(human2);

	}

	private static void display(Human h) {
		System.out.println("Name: " + h.getName() + "  Gender: " + h.getGender() + " "
				+ " Age: " + h.getAge() + "  Height: "
				+ h.getHeight() + "  Weight: " + h.getWeight() + "  "
				+ "BMI Score: " + h.calcBMI() + "  Body Category: "
				+ h.getBodyCategory());
	}

	private static void print(Human h) {
		display(h);
		h.eat();
		System.out.println("After Eating: ");
		display(h);
		h.workout();
		System.out.println("After Workout: ");
		display(h);
		System.out.println(" ");

	}
}
