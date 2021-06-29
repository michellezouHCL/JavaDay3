package com.michelle;

public class Animal {
	private String furColor;
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public Animal(String furColor){
		this.furColor=furColor;
	}
	void walk() {
		System.out.println("I am walking");
	}
	private void makeNoice() {
		System.out.print("Animal is making noise");
	}
}
