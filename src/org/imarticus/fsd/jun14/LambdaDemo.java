package org.imarticus.fsd.jun14;

//Functional Interface - It has only one abstract method

interface Some{
	public abstract void m1();
}

class Way1 implements Some{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
}

class Way2 {
public static void method() {
		
	//Anonymous Class
		Some some = new Some() {
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub	
			}
		};
		
	}
}

//Way3
public class LambdaDemo {
	public static void main(String[] args) {
		
		//(arguments) -> {method body};
		Some some = ()-> {
			System.out.println("m1");
		};
		some.m1();
	}
}









