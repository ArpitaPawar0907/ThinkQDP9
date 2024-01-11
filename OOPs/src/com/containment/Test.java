package com.containment;

public class Test {
	public static void main(String[] args) {
		
		Driver d1=new Driver(101,"Rushi");
		Driver d2=new Driver(102,"Om");
		
		Car c1=new Car(2345,"BMW",d1);
		Car c2=new Car(1234,"tiago",d2);
		
		Showroom st1=new Showroom(12, "New Motar", c1);
		
		System.out.println(st1);
	}

}
