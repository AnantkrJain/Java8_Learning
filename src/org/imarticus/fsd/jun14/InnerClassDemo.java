package org.imarticus.fsd.jun14;

public class InnerClassDemo {
	public static void main(String[] args) {
		
		InnerClassDemo obj = new InnerClassDemo();
		obj.m1();
	}
	
	void m1() {
		InnerClass obj2 = new InnerClass();
		obj2.m2();
		System.out.println("Outer");
	}
	
	class InnerClass {
		void m2() {
			System.out.println("Inner");
		}
	}
}
