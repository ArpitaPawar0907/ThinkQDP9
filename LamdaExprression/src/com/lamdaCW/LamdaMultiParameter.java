package com.lamdaCW;
interface Area
{
	void calculateArea(float len,float bre);
}

public class LamdaMultiParameter {

	public static void main(String[] args) {

		Area a1=(len,bre)->System.out.println("Area of Rectangle :"+(len*bre));

		a1.calculateArea(5.6f, 6.4f);
		
		Area a2=(len,bre)->System.out.println("Area of Square :"+(len*len));
		
		a1.calculateArea(4,0);
	}

}
