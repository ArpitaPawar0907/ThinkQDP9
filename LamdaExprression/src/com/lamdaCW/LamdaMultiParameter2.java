package com.lamdaCW;
interface Person
{
	void details(String name,int age,String add);
}
public class LamdaMultiParameter2 {

	public static void main(String[] args) {
		
		
		Person p1=(name,age,add)->System.out.println("Name: "+name+" age: "+age+" Address: "+add);
		
	    p1.details("Arpita",26,"Chakan");
		
	}
}

