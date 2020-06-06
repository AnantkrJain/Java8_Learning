package org.imarticus.fsd.jun06;

//polymorphism - same method works in different ways
//create multiple methods with different arguments - static and non-static
//Method overloading - static and non-static
//non-static within same class or super-sub class
//static only within same class

class Poly {
	void add(int i, int j, int k, int l, int m) {
		System.out.println(i+j+k+l+m);
	}
}

public class Polymorphism extends Poly{
	
	void add(int i, int j) {
		System.out.println(i+j);
	}
	void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	void add(int i, int j, int k, int l) {
		System.out.println(i+j+k+l);
	}
	
	public static void main(String[] args) {
		Polymorphism obj = new Polymorphism();
		
		obj.add(10,10);
		obj.add(10,10,10);
		obj.add(10,10,10,10);
		obj.add(10,10,10,10,10);
	}
}
