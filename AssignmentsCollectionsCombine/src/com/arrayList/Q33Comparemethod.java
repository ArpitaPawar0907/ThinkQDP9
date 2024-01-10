package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Q33Comparemethod {
	
	public static void main(String[] args) {
		
		ArrayList<Student > slist=new ArrayList<Student>();
		
		slist.add(new Student(101, "arpita"));
		slist.add(new Student(102, "prachi"));
		slist.add(new Student(103, "nisha"));
		slist.add(new Student(104, "pooja"));
		slist.add(new Student(105, "reetu"));
		
		Collections.sort(slist, new MarksComparator());
		
		for(Student s:slist)
		{
			System.out.println(s);
		}
	}

}
