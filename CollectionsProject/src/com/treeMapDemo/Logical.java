package com.treeMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.hashmapdemo.NameComparator;
import com.hashmapdemo.Student;

public class Logical {

	public static void main(String[] args) {
	
	HashMap<Student,Integer> smap=new HashMap<>();
		
		smap.put(new Student(1,"reetu"),1);
		smap.put(new Student(2,"arpita"),2);
		smap.put(new Student(3,"prachi"),3);
	//	smap.put(1,new Student(1,"reetu"));


		for(Map.Entry<Student,Integer> en:smap.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}
		System.out.println("------------------------------");
		TreeMap<Student,Integer> tmap=new TreeMap<Student, Integer>(new NameComparator());
          
		tmap.putAll(smap);

		for(Map.Entry<Student,Integer> en:smap.entrySet())
		{
			System.out.println(en.getKey()+"-->"+en.getValue());
		}

	}

}
