package org.imarticus.fsd.jun07;

public class tryCatchFinally {
	public static void main(String[] args) {
		String s1 = "10";
		String s2 = "0";
		try {
			int i = Integer.parseInt(s1);
			int j = Integer.parseInt(s2);
			System.out.println(i/j);
		} catch(ArithmeticException ae) {
			System.out.println("do not divide by zero");
		} catch(NumberFormatException nfe) {
			System.out.println("String can not be converted to number");
		} catch(Exception e) {
			System.out.println("All other exceptions");
		}
		finally {
			System.out.println("Finally block always executes");
		}
		System.out.println("done");
	}
}
