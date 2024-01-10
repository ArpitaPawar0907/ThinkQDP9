package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q35SyncronisedArrayList {
	
	public static void main(String args[]) {  
         
        List<String> fruitList = new ArrayList<String>();  
  
        fruitList.add("Mango");  
        fruitList.add("Banana");  
        fruitList.add("Apple");  
        fruitList.add("Strawberry");  
        fruitList.add("Pineapple");  
  
        Iterator<String> itr = fruitList.iterator();  
        while (itr.hasNext()) {  
            System.out.println(itr.next());  
        }
        System.out.println("=====================================");
        fruitList = Collections.synchronizedList(fruitList);  
 
       
        synchronized (fruitList) {  
            Iterator<String> sitr = fruitList.iterator();  
            while (sitr.hasNext()) {  
                System.out.println(sitr.next());  
            }  
        }  
    }  

}
