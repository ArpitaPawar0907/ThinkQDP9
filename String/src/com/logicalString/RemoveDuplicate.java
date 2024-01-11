package com.logicalString;

public class RemoveDuplicate {
	
	public static String removeDup(String old)
	{
		String n="";
		boolean found;
		for (int i = 0; i <old.length(); i++) {
			found=false;
			for (int j = 0;j<n.length(); j++) {
				if(old.charAt(i)==n.charAt(j))
				{
					found=true;
					break;
				}
			}
			if(found==false)
			{
				n=n+old.charAt(i);
			}
			
		}
		return n;
	}
	public static void main(String[] args) {
		
		String st="Missipi";
		System.out.println("original :"+st);
		System.out.println("New :"+removeDup(st));
	}

}
