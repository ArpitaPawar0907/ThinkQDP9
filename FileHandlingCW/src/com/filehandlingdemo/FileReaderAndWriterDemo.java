package com.filehandlingdemo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderAndWriterDemo {
	
	public void readFile(File f)
	{
		try {
			if(f.exists())
			{
			  FileReader fr= new FileReader(f);
			  int i=0;
			  while((i=fr.read())!=-1)
			  {
				  System.out.print((char)i);
			  }
			  
			  fr.close();
			}
			else
			{
				System.out.println("No such file exists...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void writeFile(File f)
	{
		try
		{
			if(!f.exists())
			{
				f.createNewFile();
			}
			FileWriter fw=new FileWriter(f);
			fw.write("Welcome to tq\n");
			fw.write("Training and Devlopment Program");
			fw.close();
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		
		FileReaderAndWriterDemo obj=new FileReaderAndWriterDemo();
		File f1=new File("F:\\Java\\FileDemo\\FileReaderWriterDemo.txt");
	
		obj.writeFile(f1);
		obj.readFile(f1);
	}

}
