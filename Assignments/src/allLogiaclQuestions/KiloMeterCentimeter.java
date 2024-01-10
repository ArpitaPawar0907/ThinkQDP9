package allLogiaclQuestions;

import java.util.Scanner;

public class KiloMeterCentimeter {
      
	public static void kilometerToMeter(double km) 
	{
		double meter=1000*km;
		System.out.println("KiloMeter:"+km);
		System.out.println("Meter:"+meter);
		
	}
	public static void kilometerToCentiMeter(double km) 
	{
		double centiMeter=100000*km;
		System.out.println("KiloMeter:"+km);
		System.out.println("Centimeter:"+centiMeter);
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter Kilometer ");
	     double r=sc.nextDouble();

	     kilometerToCentiMeter(r);
	     kilometerToMeter(r);
	     sc.close();
 
	}

}
