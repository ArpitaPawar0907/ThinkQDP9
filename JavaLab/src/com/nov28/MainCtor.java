package com.nov28;
class Ctor
{
	private static int counter=121;
	void Ctor()
	{
		counter=212;
	}
	//System.out.println(Ctor.counter);
	Ctor(int x)
	{
		counter=x;
		Ctor();
	}
}
public class MainCtor {
 public static void main(String[] args) {
	Ctor bg=new Ctor(112);
}
}
