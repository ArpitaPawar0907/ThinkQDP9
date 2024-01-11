package com.dec28;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
	
		ArrayList<Course> clist=new ArrayList<>();
		
		clist.add(new Course(101,"java"));
		ArrayList<Course> clist2=new ArrayList<Course>();
		clist2.add(new Course(102,".net"));
		
		ArrayList<MyStudent> slist=new ArrayList<MyStudent>();
		
		slist.add(new MyStudent(1, "arpita",new Course(101,"java")));
		slist.add(new MyStudent(2, "pranay",new Course(101,"java")));
		
		ArrayList<MyStudent> slist2=new ArrayList<MyStudent>();
		slist2.add(new MyStudent(103, "reetu",new Course(102,".net")));
		slist2.add(new MyStudent(104,"nisha",new Course(102,".net")));
		
		HashMap<ArrayList<Course>,ArrayList<MyStudent>>  shm=new HashMap<>();
		
		shm.put(clist, slist);
		shm.put(clist2, slist2);
		
		for(Map.Entry<ArrayList<Course>, ArrayList<MyStudent>> en:shm.entrySet())
		{
			System.out.println(en.getKey());
			for(MyStudent s:en.getValue())
			{
				System.out.println(s);
			}
			System.out.println("--------------------------------------------");
		}
		
		

	}

}
