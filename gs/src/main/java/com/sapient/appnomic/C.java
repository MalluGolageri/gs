package com.sapient.appnomic;

import java.util.ArrayList;
import java.util.List;

public class C {
    
	public static void main(String[] args) {
//		Integer a = null;
//		int b = a;
//		System.out.println(b);
		
		List<String> l=new ArrayList<>();
		l.add("1");
		for(String s:l) l.remove(0);
	}
	public float m(float x, float y) //throws IOException 
    {
        return 0;
    }
}

 class D extends C {
    @Override
    public float m(float x1, float x2) {
   
    	return 0;
    	}
}