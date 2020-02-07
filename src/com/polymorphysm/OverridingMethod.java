package com.polymorphysm;

public class OverridingMethod {
	public static void main(String[] args) {
		Animal animal = new Tiger();
		Animal animal1 = new Lion();
		animal1.eat();
	}
}
