package com.treesetdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class ArrayListStudent {
	
	static void createMap(ArrayList<Student> list)
	{
		HashMap<Course, Integer> hm= new HashMap<>();
		for(Student s:list)
		{
			Course c= s.getCourse();
		   if(hm.containsKey(c))
		   {
			   hm.put(c, hm.get(c)+1);
		   }
		   else
		   {
			   hm.put(c, 1);
		   }
		}
		
		for(Entry<Course, Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Student> studList=new ArrayList<>();
		
		studList.add(new Student(1, "arpita",67,new Course(101,"Java",35000)));
		studList.add(new Student(2, "nisha",76,new Course(102,".net",40000)));
		studList.add(new Student(3, "pranay",89,new Course(101,"Java",35000)));
		studList.add(new Student(4, "reetu",80,new Course(101,"Java",35000)));
		studList.add(new Student(5, "prachi",60,new Course(102,".net",40000)));
		
		for(Student s:studList)
		{
			System.out.println(s);
		}
		
		HashMap<Course, Integer> smap=new HashMap<>();
		
	}	
}
