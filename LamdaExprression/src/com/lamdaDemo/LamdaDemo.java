package com.lamdaDemo;

public class LamdaDemo {

	public static void main(String[] args) {
		
		Movable person=()->{System.out.println("Person is walking");};
		
		Movable ball=()->{System.out.println("ball is rolling");};
		
		person.move();
		ball.move();
	}

}
