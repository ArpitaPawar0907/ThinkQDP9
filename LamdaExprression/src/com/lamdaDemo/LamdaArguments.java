package com.lamdaDemo;

interface Speedable
{
	void move(float speed);
}
public class LamdaArguments {

	public static void main(String[] args) {
		
		Speedable car=(speed)->{
			  System.out.println("car is moving at "+speed+ "km/hr");  
		};
		
		Speedable truck=speed->System.out.println("truck is moving at "+speed+ "km/hr"); 
		
		car.move(50);
		truck.move(40);
	}
}
