package org.imarticus.fsd.may31;



public class Preferences {
	//Static - free access - class reference
	//non-static - restricted access - object reference
	
	//static member within static context - with class reference
	//static member within non static context - with class reference
	//non-static member within static context - with object reference
	//non-static member within non-static context - with this
	
	static int num1 = 10;
	int num2 = 20;
	
	static void staticMethod() {
		System.out.println("Static Method");
		
		System.out.println(Preferences.num1);
		
		Preferences obj = new Preferences();
		System.out.println(obj.num2);
	}
	
	void nonStaticMethod() {
		System.out.println("non static method");
		
		System.out.println(Preferences.num1);
		
		System.out.println(this.num2);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		System.out.println(num1);
		
		Preferences obj = new Preferences();
		System.out.println(obj.num2);
		
		Preferences.staticMethod();
		obj.nonStaticMethod();
	}
}
