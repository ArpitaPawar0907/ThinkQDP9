package com.staticandfinalkeyword;

public class CarTest {

	public static void main(String[] args) {
		
		Car c1=new Car("BMW",23);
		
		Car c2=new Car("Tiago",30);
		
		 System.out.println(c1);
	        System.out.println(c2);
		
        c1.setTotalCarSold(53);
        System.out.println(c1);
        System.out.println(c2);
	}

}
