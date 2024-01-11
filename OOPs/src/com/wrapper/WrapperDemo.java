package com.wrapper;

public class WrapperDemo {

	public static void main(String[] args) {
		
		
		//boxing primitive to wrapper
        int num=10;
        Integer i1=new Integer(34);
        Integer i2=48;
        
        Integer j=Integer.valueOf(num);
        
        //auto
        Integer k=num;
        System.out.println(num+" "+i1+" "+" "+i2+" "+j+" "+k);
        
        
        //unboxing
        
        Float f1=new Float(23f);
        
        float f2=f1.floatValue();
        
        //auto
        
        float f3=f1;
        
        System.out.println(f1+" "+f2+" "+f3);
        
        
        
        
        
	}

}
