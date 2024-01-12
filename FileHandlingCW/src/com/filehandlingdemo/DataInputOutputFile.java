package com.filehandlingdemo;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataInputOutputFile {

	public void readFile(File f)
	{
		try
		{
		   if(f.exists())
		   {
			 DataInputStream din=new DataInputStream(new FileInputStream(f));
			 System.out.println("Roll No:"+din.readInt());
			 System.out.println("Name: "+din.readUTF());
			 System.out.println("Marks: "+din.readFloat());
			 din.close();
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
			DataOutputStream dout=new DataOutputStream(new FileOutputStream(f));
			dout.writeInt(1);
			dout.writeUTF("Arpita");
			dout.writeFloat(67.7f);
			dout.close();
			}catch (Exception e) {
			
			}
	}
	public static void main(String[] args) {
		
		DataInputOutputFile obj=new DataInputOutputFile();
		
	
		File f1=new File("F:\\Java\\FileDemo\\DataDemo.txt");
		
		obj.writeFile(f1);
		obj.readFile(f1);
	}
	

}
