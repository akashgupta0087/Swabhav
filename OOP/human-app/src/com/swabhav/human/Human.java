package com.swabhav.human;

public class Human {
	private final String name;
	private final GenderCategory gender;
	private final int age;
	private float height;
	private float weight;

	public Human(String name, GenderCategory gender, int age, float height, float weight) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public Human(String name, GenderCategory gender, int age) {
		this(name, gender, age, 1.5f, 50);
	}

	public void eat() {
		weight = weight + weight * 0.02f;
	}
	
	public void workout() {
		weight = weight - weight * 0.01f;
		height = height - height * 0.005f;
	}
	
	public float calcBMI() {
		return weight / (height * height);
	}
	
	public String getBodyCategory() {
		float bmi = calcBMI();
		
		if(bmi < 18.5) {
			return "Underweight";
		}
		if(bmi >= 18.5 && bmi <= 24.9) {
			return "Normal";
		}
		if(bmi >= 25 && bmi <= 29.9) {
			return "Overweight";
		}
		return "Obese";
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public GenderCategory getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
	
}
