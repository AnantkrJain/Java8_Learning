package org.imarticus.fsd.jun07;

public class ThrowThrows {
	
	static void printNumbers() throws InterruptedException {
		for(int i=1; i<=10; i++) {
			Thread.sleep(250);
			System.out.println(i);
		}
	}
	static void m1() throws InterruptedException {
		ThrowThrows.printNumbers();
	}
	
	public static void main(String[] args){
		try {
			ThrowThrows.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Election...");
		try {
			ThrowThrows.checkEligibility(17);
		} catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}
		
	}
	
	static void checkEligibility(int age) {
		if(age<18) {
			throw new ArithmeticException("Can not Vote");
		}
		System.out.println("Vote for India");
	}
}
