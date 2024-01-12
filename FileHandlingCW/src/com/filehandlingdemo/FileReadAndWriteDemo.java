package com.filehandlingdemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileReadAndWriteDemo {
  
	public void readFile(File f)
	{
		try
		{
		   if(f.exists())
		   {
			   FileInputStream fin=new FileInputStream(f);
			   
			   int i=0;
			   while((i=fin.read())!=-1)
			   {
				   System.out.print((char)i);
			   }
			   fin.close();
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
			String data="I studey in tq";
			FileOutputStream fout=new FileOutputStream(f);
			byte[] arr=data.getBytes();
			fout.write(arr);
			System.out.println("Data added");
			fout.close();
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	public static void main(String[] args) {
		
		FileReadAndWriteDemo obj=new FileReadAndWriteDemo();
		
	
		File f1=new File("F:\\Java\\FileDemo\\WriteDemo.txt");
		
		//obj.writeFile(f1);
		obj.readFile(f1);
	}
	

}

