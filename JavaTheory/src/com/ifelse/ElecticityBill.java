package com.ifelse;

import java.util.Scanner;

public class ElecticityBill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Units");
		int unit=sc.nextInt();
		double billAmount;
		if(unit<=50)
			billAmount=unit*2;
		else if(unit<=80)
			billAmount=(50*2)+(unit-50)*3;
		else if(unit<=100)
			billAmount=(50*2)+(30*3)+(unit-80)*4;
		else
			billAmount=(50*2)+(30*3)+(20*4)+(unit-100)*7;
		
		
		billAmount+=100;
		System.out.println("Your total bill is "+billAmount);
	
	}

}
