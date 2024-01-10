package com.abstractinterface;
abstract class Equipment
{
	abstract void mix();
	public void fill()
	{
		System.out.println("Equimnernt fill");
		
	}
}
class CementMixer extends Equipment
{

	@Override
	void mix() {
		
		System.out.println("Cement mixer mix");
		
	}
	void pour()
	{
		System.out.println("cement mixer pour");
	}
	
}
public class Question05 {

	public static void main(String[] args) {
		
		CementMixer c1=new CementMixer();
		c1.fill();
		c1.pour();
		c1.mix();
		
		Equipment e;
		e=new CementMixer();
		e.fill();
		e.mix();
		

	}

}
