package com.abstractDemo;

abstract class Animal
{
	abstract void voice();
	
	
}
class Cat extends Animal
{

	@Override
	void voice() {
		
		System.out.println("Cat meow meow");
		
	}
	
}
class Dog extends Animal
{

	@Override
	void voice() {
		System.out.println("Dog barks");
		
	}
	
}
public class AnimalTest {

	public static void main(String[] args) {
		
		Animal a;
		a=new Cat();
		
		a.voice();
		a=new Dog();
		
		a.voice();

	}

}
