package org.imarticus.fsd.may31;

public class blockDemo {
	//block executes automatically
	//static block executes once the class is loaded
	//non static block executes every time an object is created
	
	static {
		System.out.println("----static block - Class Loading----------");
	}
	blockDemo(){
		System.out.println("----Constructor - Object Initialization-----------");
	}
	{
		System.out.println("----non static block - Object Creation----------");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main");
		
		blockDemo obj = new blockDemo();
		new blockDemo();
		new blockDemo();
		obj.hi();
	}
	
	void hi() {
		System.out.println("Hi");
	}
}
