package com.outside;

import com.encapsulation.AccessModifier;

public class OutsidePackageinheritance extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier a1=new AccessModifier();
	//	a1.a=90;    Private is not accesible
	//	a1.b=67;    default is not accessible
		a1.c=98;
		a1.display1();
		
		a1.display1();
		a1.display();
		//a1.show();
		//a1.printMe();
	}
}
