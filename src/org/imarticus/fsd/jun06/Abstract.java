package org.imarticus.fsd.jun06;

//abstract method - No method body, only method signature, can be present only in either abstract class or interface
//abstract class - no object, can be extended, can have abstract and concrete methods

abstract class ClassOne {
	abstract void m2();
	
	void m1() {
		System.out.println("m1");
	}
}

class ClassTwo extends ClassOne {
	void m2() {
		System.out.println("m2");
	}
}

public class Abstract {
	public static void main(String[] args) {
		
		ClassTwo obj = new ClassTwo();
		obj.m2();
		obj.m1();
	}
}
