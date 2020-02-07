package com.polymorphysm;

public class Animal {
	public void eat() {
		System.out.println("is eating");
	}
}


class Lion extends Animal{
	public void eat() {
		System.out.println("Lion is eating...!!");
	}
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Tiger is eating...!!");
	}
}