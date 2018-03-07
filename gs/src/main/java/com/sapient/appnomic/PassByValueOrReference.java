package com.sapient.appnomic;

public class PassByValueOrReference {
	public static void main(String[] args) {
		PassByValueOrReference obj=new PassByValueOrReference();
		Dummy d = new Dummy(10, 20,"abc");
		System.out.println("Before change:"+d.a+" "+d.b+" "+d.s);
		obj.tryChanging(d);
		System.out.println("After change:"+d.a+" "+d.b+" "+d.s);
		
		
		Dummy d1 = new Dummy(1, 2,"abc");
		Dummy d2 = new Dummy(4, 5,"abc");
		
		System.out.println("Before Swapping:"+d1.a+" "+d1.b+" "+d.s);
		trySwapping(d1,d2);
		System.out.println("After Swapping:"+d1.a+" "+d1.b+" "+d.s);
	}
	private static void trySwapping(Dummy d1, Dummy d2) {
		Dummy temp=d1;
		d1=d2;
		d2=d1;
		System.out.println("Inside Swapping:"+d1.a+" "+d1.b);
	}
	
	private void tryChanging(Dummy d) {
		d.a=30;
		d.b=40;
		d.s="xyz";
	}
}

class Dummy {
	String s;
	int a;
	int b;
	public Dummy(int i, int j,String s) {
		this.a = i;
		this.b = j;
		this.s=s;
	}	
}
