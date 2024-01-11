package com.nov28;
class Ctor1
{
	public static int counter=121;
	
	void Ctor1()
	{
		counter=212;
		System.out.println(Ctor1.counter);
	}
	
	Ctor1(int x)
	{
		counter=x;
		Ctor1();
	}
}
public class MainCtor2 {

	public static void main(String[] args) {
	
		Ctor1 bg=new Ctor1(112);
		//System.out.println(Ctor1.counter);
	}

}
