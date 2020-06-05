package org.imarticus.fsd.may31;

//constructor - special type of method
//It is used to create objects
//name is same as class name
//JVM provides a default constructor
//Class can have one or more constructors
//If we create constructor, JVM does not provide one

class Hello{
	
	Hello() {
		System.out.println("constructor");
	}
	
	static int num1 = 10;
	int num2 = 20;
}

public class constructorDemo {
	public static void main(String[] args) {
		Hello obj = new Hello();
		System.out.println(obj.num2);
	}
}
