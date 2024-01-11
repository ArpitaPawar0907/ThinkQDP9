package com.inheritance;

import com.encapsulation.AccessModifier;

public class AccessWithinPack {

	public static void main(String[] args) {
		AccessModifiers a1=new AccessModifiers();
		//	a1.a=90;    Private is not accesible
		//	a1.b=67;    default is not accessible
			a1.c=98;
			a1.d=90;
			a1.display();
			//a1.show();
			//a1.printMe();
			a1.display1();
			}

}
