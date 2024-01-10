package com.twodarray;

public class AverageOfInnerMatrix {

	public static void avgInnerMatrix(int a[][])
	{
		int sum=0,avg;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				if((i!=0)&&(j!=0)&&(i!=(a.length-1))&&(j!=(a[0].length-1)))
				{
				//System.out.print(a[i][j]+" ");
					sum+=a[i][j];
					count++;
					
				}
			}
			//System.out.println();
		}
		
		avg=sum/count;
		System.out.println("Average of inner matrix:"+avg);
	}
	public static void display(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j:a[i])
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int mat[][]= {{1,2,3,4},{5,6,7,8},{2,5,3,6},{5,9,7,6}};
        display(mat);//6573=21/4=5 
        avgInnerMatrix(mat);
	}

}
