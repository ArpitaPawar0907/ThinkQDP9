package com.lamdaDemo;
interface Additon
{
	void sum(int n1,int n2);
	
}
interface Subtraction
{
	int diff(int n1,int n2);
}
public class LamdaultiParameters {

	public static void main(String[] args) {
	
		Additon a1=(n1,n2)->System.out.println("sum is"+(n1+n2));
		a1.sum(2, 3);
		
		Additon a2=(int n1,int n2)->System.out.println("sum is"+(n1+n2));
		a2.sum(12, 13);
		
		
		Subtraction s1=(n1,n2)->(n1-n2);
		System.out.println("difference is"+s1.diff(5, 3));

	}

}
