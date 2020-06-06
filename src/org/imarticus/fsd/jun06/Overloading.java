package org.imarticus.fsd.jun06;

//Overloading - Same name but different parameters/arguments
//There are three ways -
//1. Different number of arguments
//2. Different types of arguments
//3. Different order of arguments

public class Overloading {
	void add(int i, int j) {
		System.out.println(i+j);
	}
	void add(int i, int j, int k) {
		System.out.println(i+j+k);
	}
	void add(int i, byte j) {
		System.out.println(i+j);
	}
	void add(byte i, int j) {
		System.out.println(i+j);
	}
	public static void main(String[] args) {
		
	}
}
