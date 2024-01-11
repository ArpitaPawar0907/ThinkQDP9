package com.interfacedemo;

interface Bakary
{
	String bname="MyBakary";
	abstract void bake();
}
class Cake implements Bakary
{

	@Override
	public void bake() {
		System.out.println("Cake :pineapple,butterschoch,chocolate");
		
	}
	
}
class Biscuit implements Bakary
{

	@Override
	public void bake() {
		System.out.println("Biscuit:almond,pista,chocochip");
		
	}
	
	public void minOrder()
	{
		System.out.println("Minimun order is 250g");
	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		System.out.println("Bakary name"+Bakary.bname);
		System.out.println("-----------------------------------");
		Cake c1=new Cake();
		Biscuit b1=new Biscuit();
		
		c1.bake();
		b1.bake();
		b1.minOrder();
		
		Bakary b;
		b=new Cake();
		b.bake();
		
		b=new Biscuit();
		b.bake();
		//b.minOrder();

	}

}
