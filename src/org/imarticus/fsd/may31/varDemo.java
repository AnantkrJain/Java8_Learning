package org.imarticus.fsd.may31;

public class varDemo {
	static int num3 = 30; //global, class-level variable, field, data member
	
	static void add() {
		int num2 = 20;
		
		System.out.println(num2);
		System.out.println(num3);
	}
	
	public static void main(String[] args) {
		int num=10;
		System.out.println(num);
		System.out.println(num3);
	}
}
