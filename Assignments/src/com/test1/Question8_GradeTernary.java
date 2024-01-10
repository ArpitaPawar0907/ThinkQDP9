package com.test1;

import java.util.Scanner;

public class Question8_GradeTernary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter percentage");
	   int marks=sc.nextInt();
	   System.out.println("Enter Subject");
	   String sub=sc.next();
	   String result=(marks>80)?"Distinction":(marks>70?"First class":(marks>60?(sub=="physics"?"Pass":"Special pass"):"Fail"));
   System.out.println(result);
	}

}
