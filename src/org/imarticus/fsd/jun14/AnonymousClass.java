package org.imarticus.fsd.jun14;

interface AnonInt{
	void m2();
}

public class AnonymousClass{
	public static void main(String[] args) {
		
		AnonInt obj = new AnonInt() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				System.out.println("m2");
			}
		};
		obj.m2();
	}
}
