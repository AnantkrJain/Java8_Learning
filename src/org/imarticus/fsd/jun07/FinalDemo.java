package org.imarticus.fsd.jun07;

//Final class can not be extended
//Final method can not be overridden
//Final variable can not be reassigned

final class ClassOne{
	
}

class ClassThree extends ClassTwo {
	final void m1() {
		
	}
}

class ClassTwo{
//	@Override
//	void m1() {
//		
//	}
}

public class FinalDemo {
	public static void main(String[] args) {
		//value of i can not be changed
		final int i = 10;
		System.out.println(i);
	}

}
