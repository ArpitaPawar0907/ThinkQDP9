package com.dec28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMap {

	public static void main(String[] args) {
	
		ArrayList<Float> marksList1=new ArrayList<Float>();
	    marksList1.add(45f);
	    marksList1.add(65f);
	    marksList1.add(78f);
	    marksList1.add(76f);
	    marksList1.add(84f);
	
		ArrayList<Float> marksList2=new ArrayList<Float>();
	    marksList2.add(56f);
	    marksList2.add(74f);
	    marksList2.add(78f);
	    marksList2.add(72f);
	    marksList2.add(88f);
	
		ArrayList<Float> marksList3=new ArrayList<Float>();
	    marksList3.add(75f);
	    marksList3.add(34f);
	    marksList3.add(34f);
	    marksList3.add(35f);
	    marksList3.add(86f);
	
		ArrayList<Student> studList1=new ArrayList<Student>();
		studList1.add(new Student(1,"arpita", marksList1,'B'));
		studList1.add(new Student(2,"pranay", marksList2,'A'));
		studList1.add(new Student(3,"reetu", marksList3,'C'));
		studList1.add(new Student(4,"prachi", marksList2,'A'));
		studList1.add(new Student(5,"nisha", marksList3,'C'));
		studList1.add(new Student(6,"pranali", marksList1,'B'));
		
		HashMap<Character,ArrayList<Student>> smap=new HashMap<>();
		ArrayList<Student> slist=null;
		
		for(Student s:studList1)
		{
			
			slist=new ArrayList<Student>();
			for(Student s1:studList1)
			{
				if(s.getGrade()==s1.getGrade())
				{
					slist.add(s1);
				}
				smap.put(s.getGrade(), slist);
			}
					
		}
		
		
		
		for(Map.Entry<Character,ArrayList<Student>> en:smap.entrySet())
		{
			System.out.println(en.getKey());
			for(Student s:en.getValue())
			{
				System.out.println(s);
			}
			System.out.println("-------------------------------------");
		}
		
		
		
		
		
			}

}
