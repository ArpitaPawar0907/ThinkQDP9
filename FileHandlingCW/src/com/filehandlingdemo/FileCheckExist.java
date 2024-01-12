package com.filehandlingdemo;

import java.io.File;
import java.io.IOException;

public class FileCheckExist {
	
	public static void main(String[] args) {
		
		File f1=new File("F:\\Java\\FileDemo\\Arpita.txt");
		
		try {
			f1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(f1.exists())
		{
		
			if(f1.isFile())
			{
				System.out.println("Path"+f1.getAbsolutePath());
				System.out.println("Lenght: "+f1.length());
				System.out.println("File NAme"+f1.getName());
				System.out.println("write"+f1.canWrite());
			}
			else 
			{
				System.out.println("Its directort");
			}
		}
		else
		{
			System.out.println(" file is not exist");
		}
	}

}
