package com.forLoop;

public class BreakContinue {

	public static void breakMethod()
	{
		for(int i=1;i<10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
	}
	public static void continueMethod()
	{
		for(int i=1;i<10;i++)
		{
			if(i==5)
				continue;
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		
		breakMethod();
		System.out.println("------------------------");
		continueMethod();

	}

}
