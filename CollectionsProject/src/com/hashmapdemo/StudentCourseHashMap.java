package com.hashmapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentCourseHashMap {

	public static void createStudentCount(HashMap<Student,Course> sm)
	{
		
		HashMap<Course,Integer> hmap=new HashMap<Course, Integer>();
		
		for(Map.Entry<Student, Course> en:sm.entrySet())
		{
			Course c=en.getValue();
			if(hmap.containsKey(c))
			{
				hmap.put(c, hmap.get(c)+1);
			}
			else
			{
				hmap.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Course, Integer> en:hmap.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
	}
	public static void createStudentName(HashMap<Student,Course> sm)
	{
		
		HashMap<Course,ArrayList<String>> hmap=new HashMap<>();
		ArrayList<String> names;
		for(Map.Entry<Student, Course> en:sm.entrySet())
		{
			Course c=en.getValue();
			
			if(hmap.containsKey(c))
			{
				names=hmap.get(c);
			}
			else
			{
				names=new ArrayList<String>();
			}
			
			names.add(en.getKey().getName());
			hmap.put(c, names);
		}
		
		for(Map.Entry<Course, ArrayList<String>> en:hmap.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		
	}
	public static void createStudentDetails(HashMap<Student,Course> sm)
	{
		
		HashMap<Course,ArrayList<Student>> hmap=new HashMap<>();
		ArrayList<Student> stud;
		for(Map.Entry<Student, Course> en:sm.entrySet())
		{
			Course c=en.getValue();
			
			if(hmap.containsKey(c))
			{
				stud=hmap.get(c);
			}
			else
			{
				stud=new ArrayList<Student>();
			}
			
			stud.add(en.getKey());
			hmap.put(c, stud);
		}
		
		for(Map.Entry<Course, ArrayList<Student>> en:hmap.entrySet())
		{
			System.out.println(en.getKey()+"\n"+en.getValue());
			System.out.println("------------------------------------");
		}
		
	}
	
	public static void main(String[] args) {
		
		HashMap<Student,Course> hm=new HashMap<Student, Course>();
		
		hm.put(new Student(1,"reetu"),new Course(101,"Java"));
		hm.put(new Student(2,"pranay"),new Course(102,".net"));
		hm.put(new Student(3,"arpita"),new Course(101,"Java"));
		hm.put(new Student(4,"prachi"),new Course(102,".net"));
		hm.put(new Student(5,"baskar"),new Course(102,".net"));
		
		
		createStudentCount(hm);
		System.out.println("============================================");
		createStudentDetails(hm);
		System.out.println("====================================================");
		createStudentName(hm);
		


	}

}
