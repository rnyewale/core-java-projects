package com.polymorphysm;

public class PolymorphysmEx {

	public void add() {
		System.out.println("First Method");
	}
	
	public void add(int a) {
		System.out.println("Overloading with one param "+a);
	}
	
	/*
	 * public int add(int b) { return a; }
	 */
	
	public void add(String a) {
		System.out.println("Overloading with one param "+a);
	}
		
	public void add(int a, int b) {
		System.out.println("Overloading with two param" +a+" "+b);
	}
	
	
	public void add(double a, int b) {
		System.out.println("Overloading with two param "+a+" "+b);
	}
	
	
	public static void main(String[] args) {
		PolymorphysmEx ex = new PolymorphysmEx();
		ex.add(10);
		ex.add("String ");
		ex.add(10.3, 10);
		ex.add(10,20);
		
	}

}
