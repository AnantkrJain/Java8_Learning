package org.imarticus.fsd.jun14;

public class MethodLocalICDemo {
	public static void main(String[] args) {
		
		MethodLocalICDemo obj = new MethodLocalICDemo();
		obj.m1();
	}
	
	void m1() {
		System.out.println("m1");
		
		class MethodLocalInnerClass {
			
			public void m2() {
				System.out.println("m2");
			}
		}
		MethodLocalInnerClass obj = new MethodLocalInnerClass();
		obj.m2();
	}
}
