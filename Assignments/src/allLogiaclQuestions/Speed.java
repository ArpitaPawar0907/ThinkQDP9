package allLogiaclQuestions;

import java.util.Scanner;

public class Speed {
	public static void calculateSpeed(double distance,double time)
	{
	//double	speed =(distance/time) ;
	System.out.println("Speed ="+(distance/time));
	}
  public static void main(String[] args) {
	
	  Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Distance ");
	     double dist=sc.nextDouble();
	     System.out.println("Enter Time");
	     double t=sc.nextDouble();
	     calculateSpeed(dist, t);
	     
	     sc.close();
}
}
