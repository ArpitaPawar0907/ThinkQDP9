package com.oopsAssignment;

public class Question6 {

	public static void main(String[] args) {
		
		Student s1=new Student(1,"Arpita",89);
		Student s2=new Student();
		
		s2=s1;
		System.out.println(s1);
		System.out.println(s2);

	}

}
