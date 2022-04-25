package com.nt.test;



import com.nt.inter.DefaultInterf;

public class DefaultTest implements DefaultInterf {
public static void main(String[] args) {
	DefaultTest test=new DefaultTest();
	test.m1();
	test.m();
	test.res();
}
	@Override
	public   void m1() {
		
		System.out.println("Hello");

	}
	
	public static void m() {
		System.out.println("Static Area");
	}

}
