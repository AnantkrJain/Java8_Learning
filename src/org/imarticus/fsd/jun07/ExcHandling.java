package org.imarticus.fsd.jun07;

public class ExcHandling {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c=a/b;
			System.out.println(c);
		}catch(ArithmeticException ae){
			System.out.println("not allowed");
		}
		System.out.println("Basic Exception Handling");
	}

}
