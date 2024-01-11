package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {

	public static void main(String[] args) {
		
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(101, "Pranali", 67));
		list.add(new Student(103, "Pooja", 60));
		list.add(new Student(106, "Nisha", 67));
		list.add(new Student(102, "Pranay", 78));
		list.add(new Student(104, "Reetu", 69));

		for(Student s:list)
		{
			System.out.println(s);
		}
		
		Collections.sort(list);
		
        System.out.println("-------------------------------------------------------");
		for(Student s:list)
		{
			System.out.println(s);
		}

		
	}

}
