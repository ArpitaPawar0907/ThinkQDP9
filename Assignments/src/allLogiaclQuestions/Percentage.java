package allLogiaclQuestions;

import java.util.Scanner;

public class Percentage {
public static Scanner sc=new Scanner(System.in);

    public static void calculatePercentage()
    {
    	System.out.println("Enter name of Stuent");
    	String name=sc.next();
    	System.out.println("Enter marks of five subjects");
    	int sub1=sc.nextInt();
    	int sub2=sc.nextInt();
     	int sub3=sc.nextInt();
    	int sub4=sc.nextInt();
     	int sub5=sc.nextInt();
    	
     	double per=(sub1+sub2+sub3+sub4+sub5)/5;
     	System.out.println(name+" has "+per+" %");
    	
    }
	public static void main(String[] args) {
		
     calculatePercentage();
	}

}
