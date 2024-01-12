package com.singletonDemo;

public class SingletonTest {

	public static void main(String[] args) {
		
		SingletonClass s1=SingletonClass.getSingleton();
		SingletonClass s2=SingletonClass.getSingleton();
		SingletonClass s3=SingletonClass.getSingleton();
		
		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
		
		s1.msg="Hello";
		

		System.out.println(s1.msg);
		System.out.println(s2.msg);
		System.out.println(s3.msg);
		
		

	}

}
