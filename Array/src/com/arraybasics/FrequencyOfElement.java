package com.arraybasics;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void calFreq(int a[])
	{
		int count;
		boolean status;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			status=false;
			for(int j=i-1;j>=0;)
			{
				if(a[i]==a[j])
					status=true;
				    break;
			}
			if(status==false)
			{
				for(int k=i+1;k<a.length;k++)
				{
					if(a[i]==a[k])
					count++;
				}
				
				System.out.println(a[i]+"--->"+count);
//				if(count>1)
//					System.out.println(a[i]+"--->"+count);
//				
			}
			
			
			
		}
	}
	public static void main(String[] args) {
	
		int arr[]= {1,2,1,1,3,5,2};
		 System.out.println(Arrays.toString(arr));
		calFreq(arr);
		

	}

}
