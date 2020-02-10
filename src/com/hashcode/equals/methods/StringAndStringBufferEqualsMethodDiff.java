package com.hashcode.equals.methods;

public class StringAndStringBufferEqualsMethodDiff {

	public static void main(String[] args) {
		String s1 = new String("Java Programming");
		String s2 = new String("Java Programming");

		s2.concat(" Language");

		StringBuffer buffer = new StringBuffer("Java Programming");
		StringBuffer buffer2 = new StringBuffer("Java Programming");

		// buffer.append("Language");
		 buffer=buffer2;

		System.out.println(" In String equals() method used for CONTENT comparison.\n Ex s1.equals(s2):" + (s1.equals(s2))+"\n");
		System.out.println(" In StringBuffer equals() method used for REFERENCE comparison\n Ex buffer.equals(buffer2): "
		+ (buffer.equals(buffer2)) + "\n");
		

		if (s1 == s2) {  
			System.out.println("s1 == s2");
		} else
			System.out.println("s1! = s2 ");

		if (buffer == buffer2)
			System.out.println("buffer == buffer2");
		else
			System.out.println("buffer != buffer2");
	}

}
