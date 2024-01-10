package com.thisconstructorchaining;

public class CycleTest {

	public static void main(String[] args) {
		
		Cycle c1=new Cycle();
		System.out.println(c1);
		System.out.println("-----------------------");
		Cycle c2=new Cycle(123,4);
		System.out.println(c2);
	
	}

}
