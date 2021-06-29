package com.michelle;

public class InheritenceExample {
	public static void main(String[] args) {
		Bike M = new Bike();
		M.define_me();
		System.out.println("\nExercise 2:");
		Dog dog = new Dog("Gold");
		dog.walk();
		dog.eat();
		dog.bark();
		// System.out.println(dog.getFurColor());
		dog.makeNoise("woof");

		System.out.println("\nExercise 3: hello");
		A a = new A("Abe");
		B b = new B("Bob", 27);
		a.greet();
		b.greet();
		b.tellAge();
		
	}
}
