package com.innerclassDemo;

interface Doable {
	public void doIt();

}

class Car {
	public void drive() {
		System.out.println("I am driving car");
	}

}

abstract class Cake {
	abstract void bake();
}

public class AnanymousInnerClass {

	public static void main(String[] args) {

		Doable d1 = new Doable() {

			@Override
			public void doIt() {
				System.out.println("I am cooking");

			}
		};
		d1.doIt();

		Car c=new Car()
				{
			  public void drive()
			     {
                  System.out.println("I am driving audi");			    	 
			     }
				};
		c.drive();		
		Cake c1 = new Cake() {

			@Override
			void bake() {
				System.out.println("I am baking chocolate cake");

			}
		};

		c1.bake();
	}

}
