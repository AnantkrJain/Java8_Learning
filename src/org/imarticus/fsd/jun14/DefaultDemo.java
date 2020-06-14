package org.imarticus.fsd.jun14;

interface In1{
	
	void m1();
	
	static void m2() {
		
	}
	
	default void m3() {
		System.out.println("m3");
	}
}

public class DefaultDemo implements In1{
	public static void main(String[] args) {
		
		DefaultDemo obj = new DefaultDemo();
		obj.m3();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}
