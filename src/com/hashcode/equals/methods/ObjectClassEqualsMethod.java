package com.hashcode.equals.methods;

public class ObjectClassEqualsMethod {

	public static void main(String[] args) {
		Student s1 = new Student(2411, "Ram Yewale");
		Student s2 = new Student(2411, "Ram Yewale");
		Student s3 = new Student(2412, "Suraj Kale");
		Student s4 = s1;
		Student s5 = new Test(0, null);

		final Student stud = new Student(25,"final for object is applicable...!!");
		
		stud.rollNo = 10;
		stud.studName = "Modified Name of Student";
		
		//stud = new Student(15, ""); // this is not allowed...!!!
		
		System.out.println("\n"+stud.rollNo+" "+stud.studName+"\nfinal Student stud = new Student(25,\"final for object is applicable...!!\");"
				+ "\nstud = new Student(15, name); but this is not allowed...!!!\n");
		
		System.out.println("Is s1.equlas(s2): " + s1.equals(s2));// true
		System.out.println("Is s1.equlas(s3): " + s1.equals(s3));// false
		System.out.println("Is s1.equlas(s4): " + s1.equals(s4));// true
		System.out.println("Is s1.equals(s5): " + s1.equals(s5));
	}

}

class Test extends Student {

	public Test(int roll, String name) {
		super(roll, name);
		// TODO Auto-generated constructor stub
	}
}

class Student {
	int rollNo; // 2411
	String studName; // Ram Yewale

	public Student(int roll, String name) { // Student s1 = new Student(2411,"Ram Yewale");
		this.rollNo = roll;
		this.studName = name;
	}

	public boolean equals(Object obj) {

		if ( this == obj) {
			return true;
		}

		if (obj instanceof Student) {
			Student s = (Student) obj;

			if (studName.equals(s.studName) && rollNo == s.rollNo)
				return true;
			else
				return false;
		}

		return false;
	}

}