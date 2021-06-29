package com.michelle;

public class B extends A{
	int age;
	B(String name, int age){
		super(name);
		this.age = age;
	}
	void tellAge() {
		System.out.println("I am "+ age);
	}
}
