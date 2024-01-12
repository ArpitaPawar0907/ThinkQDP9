package com.filehandlingdemo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferInputDemo {
  
	public void readFile(File f)
	{
		try
		{
		   if(f.exists())
		   {
			 
			   BufferedInputStream bin=new BufferedInputStream(new FileInputStream(f));
			   int i=0;
			   while((i=bin.read())!=-1)
			   {
				   System.out.print((char)i);
			   }
			   bin.close();
		   }
		   else
		   {
			   System.out.println("No such file exists");
		   }
		}catch (Exception e) {
			System.out.println(e);
		}
	
	}
	public void writeFile(File f)
	{
		try {
			if(!f.exists())
			{
				f.createNewFile();
			}
			String data="Welcome to learn java learning";
			FileOutputStream fout=new FileOutputStream(f);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			byte[] arr=data.getBytes();
			bout.write(arr);
			System.out.println("Data added");
			bout.close();
			}catch (Exception e) {
				System.out.println(e);
			}
	}
	public static void main(String[] args) {
		
		BufferInputDemo obj=new BufferInputDemo();
		
	
		File f1=new File("F:\\Java\\FileDemo\\BufferDemo.txt");
		
		obj.writeFile(f1);
		obj.readFile(f1);
	}
	

}

