package com.exceptionhandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q28FileNotFound {

	static void method1() throws IOException
	{
	   method2();	
	}
	static void method2() throws IOException 
	{
		method3();
	}
	static void method3() throws IOException
	{
		String test="FileDoesNotExist";
	
		File file=new File(test);
		Scanner sc=new Scanner(file);
		sc.close();
	}
	public static void main(String[] args) {
		
      	try {	
          method1();
      	}catch (Exception e) {
            System.out.println(e);
		}
      	
	}

}
