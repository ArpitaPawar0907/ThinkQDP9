package com.arraybasics;

public class EnhanceLoop {

	public static void main(String[] args) {
		
		int arr[]= {3,8,9,6,7};
		for(int i:arr)
		{
			System.out.println(i);
		}
		
		for(int i:arr)
		{
			i=i*i*i;
		}
//cannot update,cannot access index
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		//changes will be not visible


	}

}
