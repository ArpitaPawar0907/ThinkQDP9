package com.abstractclass;

abstract class Abs1
{
   abstract  void doAbs1();	
}

abstract class Abs2
{
   abstract void doAbs2();	
}
class Test extends Abs1
{

	@Override
	void doAbs1() {
		System.out.println("Abstract 1 method");
		
	}
	
}
class Test2 extends Abs2
{

	@Override
	void doAbs2() {
		System.out.println("Abstract 1 method");
		
	}
	
}

public class Question03 {

	public static void main(String[] args) {
		
		Test t1=new Test();
		t1.doAbs1();
		
		Test2 t2=new Test2();
		t2.doAbs2();
		

		

	}

}
