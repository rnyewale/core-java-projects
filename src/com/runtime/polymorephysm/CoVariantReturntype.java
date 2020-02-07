package com.runtime.polymorephysm;

public class CoVariantReturntype {

	public static void main(String[] args) {
		Student sport = new Sport();
		System.out.println(" " + sport.getStudent());
	}

}

class Student {
	Student getStudent() {
		return new Student();
	}
}

class Sport extends Student {

	// this is co-variant return type example.
	@Override
	Sport getStudent() {
		return new Sport();
	}
}