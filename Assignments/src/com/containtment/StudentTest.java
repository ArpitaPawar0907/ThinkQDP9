package com.containtment;

import java.util.Scanner;

public class StudentTest {
	
    static Scanner sc=new Scanner(System.in);
     public static void enterDetails(Student s)
     {
	System.out.println("Enter Student id");
	s.setSid(sc.nextInt());
	
	System.out.println("Enter employee name");
	s.setSname(sc.next());
	
    s.setDept(new Department());
    
    System.out.println("enter department id");
    s.getDept().setDid(sc.nextInt());
    
    System.out.println("Enter department name");
    s.getDept().setDname(sc.next());
     }
	public static void main(String[] args) {
		
		
		Student s1=new Student();
		Student s2=new Student();
		
		enterDetails(s1);
		enterDetails(s2);
		
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
