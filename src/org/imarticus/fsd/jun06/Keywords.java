package org.imarticus.fsd.jun06;

//this - used to access static non-member of this class
//super - used to access non-static member of parent or super class

class Parent{
	int num =10;
}

class Child extends Parent{
	int num=20;
}

public class Keywords extends Child{
	int num=30;
	
	void m1() {
		System.out.println(this.num);
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		Keywords obj = new Keywords();
		obj.m1();
	}
}
