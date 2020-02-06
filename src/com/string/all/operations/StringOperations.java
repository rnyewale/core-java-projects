package com.string.all.operations;

public class StringOperations {

	public static void main(String[] args) {
		System.out.println("String is immutable in Java.");
		
		String s1 = "Java Programming";
		String s2 = "Java Programming";
		
		System.out.println("s1 hashcode:- "+ s1.hashCode());
		System.out.println("s1 hashcode:- "+ s2.hashCode());
		
		System.out.println("s1.equals(s2) : "+ s1.equals(s2));
		
		if(s1 == s2)
			System.out.println("s1==s2 : true");
		else
			System.out.println("false");

	}

}
