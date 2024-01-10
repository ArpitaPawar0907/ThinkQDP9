package com.methodoverriding;

public class KidTest {
	public static void main(String[] args) {


			
			Kid k1=new Kid();
			BigKid b1=new BigKid();
	        k1.readBook();
	        k1.readBook("Ramayana", "Walmiki");
	    	b1.readBook("Abcd", "ACSD", 12);



	}

}
