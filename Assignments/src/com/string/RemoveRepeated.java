package com.string;

public class RemoveRepeated {

	public static void repeatChar(String old)
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
	System.out.println(n);
	}
	public static void main(String[] args) {
		
		String str="sunny";
		System.out.println(str);
		repeatChar(str);

	}

}
