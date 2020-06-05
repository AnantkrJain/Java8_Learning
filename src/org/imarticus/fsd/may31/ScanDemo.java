package org.imarticus.fsd.may31;

import java.util.Scanner;

public class ScanDemo {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter your name");
			String name = sc.nextLine();
			System.out.println("Please enter your phone");
			long phone = sc.nextLong();
			System.out.println("Please enter your salary");
			double salary = sc.nextDouble();
			
			System.out.println(name+" "+phone+" "+salary);
		}
	}

}
