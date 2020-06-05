package org.imarticus.fsd.may31;


//types of methods -
//With Arguments with return value - WAWR
//With Arguments no return value - WANR
//No Arguments with return value - NAWR
//No Arguments no return value - NANR

public class Method {
	
	static int wawr(int i) {
		return i+1;
	}
	
	static void wanr(int i) {
		System.out.println(i+1);
	}
	
	static int nawr() {
		return 1;
	}
	
	static void nanr() {
		System.out.println(1);
	}
	
	public static void main(String[] args) {
		
	}
}
