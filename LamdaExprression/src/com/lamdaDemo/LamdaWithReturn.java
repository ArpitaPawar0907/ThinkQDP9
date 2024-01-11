package com.lamdaDemo;

interface LenghtName
{
	int findLength(String name);
	public static void show(String name)
	{
		System.out.println("Welcome :"+name);
	}
}
public class LamdaWithReturn {

	public static void main(String[] args) {
	
		LenghtName l1=(name)->{return name.length();};
		
           System.out.println(l1.findLength("Arpita"));
           
           LenghtName l2=name->name.length();
           System.out.println(l2.findLength("nisha"));
	}

}
