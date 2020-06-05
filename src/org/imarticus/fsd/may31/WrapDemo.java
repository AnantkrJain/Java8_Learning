package org.imarticus.fsd.may31;

public class WrapDemo {
	
	public static void main(String[] args) {
		int num = 10;
		
		Integer num2 = Integer.valueOf(num); //boxing(primitive to object)
		int num3 = num2.intValue(); //Unboxing(object to primitive)
		
		
		WrapDemo obj = new WrapDemo();
	}

}
