package com.inheritance;

import com.encapsulation.AccessModifier;

public class AccessModifiers {

	
		
		private int a;
		int b;
		public int c;
		protected int d;
		private void show()
		{
			System.out.println("Private");
		}
		void printMe()
		{
			System.out.println("Default");
		}
		public void display()
		{
	     System.out.println("Public");		
		}
		public void display1()
		{
	     System.out.println("Protected");		
		}
		public static void main(String[] args) {
			
			AccessModifiers a1=new AccessModifiers();
			a1.a=90;
			a1.b=67;
			a1.c=98;
			a1.display();
			a1.show();
			a1.printMe();
		//in in side class all are accible

	}

}
