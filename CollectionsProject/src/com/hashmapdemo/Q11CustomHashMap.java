package com.hashmapdemo;

import java.util.HashMap;
import java.util.Map;

public class Q11CustomHashMap {
	
	public static void main(String[] args) {
		
		HashMap<Course, Student> courHm=new HashMap<Course, Student>();
		
		courHm.put(new Course(101, "Java"),new Student(1, "pranali"));
		courHm.put(new Course(102, "C"),new Student(1, "prachi"));
		courHm.put(new Course(103, "C++"),new Student(1, "pranay"));
		courHm.put(new Course(104, "Angular"),new Student(1, "pooja"));
		
		for(Map.Entry<Course, Student> en:courHm.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
	}

}
