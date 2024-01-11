package com.methodoverloading;

public class MainClass {

	public static void main(String[] args) {
		
		ClassOne one=new ClassOne();
		one.method("JAVA");
      
	}

}

//prints 6 times JAVA
class ClassOne
{
	void method(String s1)
	{
		method(s1,s1+s1);//JAVA ,JAVAJAVA
	}
	void method(String s1,String s2)
	{
		method(s1,s2,s1+s2);//JAVA ,JAVAJAVA ,JAVAJAVAJAVA
	}
	void method(String s1,String s2,String s3)
	{
		System.out.println(s1+s2+s3);
	}
}
