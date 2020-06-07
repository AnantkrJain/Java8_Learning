package org.imarticus.fsd.jun07;

//Exception Propagation is passing exception object from one method to another. It occurs within JVM method area.
public class ExcPropagation {
	
	static void m1() {
		System.out.println(10/0);
	}
	static void m2() {
		ExcPropagation.m1();
	}
	static void m3() {
		ExcPropagation.m2();
	}
	static void m4() {
		ExcPropagation.m3();
	}
	public static void main(String[] args) {
		System.out.println("Start");
		ExcPropagation.m4();
	}
}
