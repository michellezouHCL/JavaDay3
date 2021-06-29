package com.michelle;

public class Dog extends Animal{
	Dog(String furColor){
		super(furColor);
	}
	void eat() {
		System.out.println("I am eating");
	}
	void bark() {
		System.out.println("I am barking");
	}
	void makeNoise(String noise) {
		System.out.println("Dog is making noise:"+noise);
	}
}
