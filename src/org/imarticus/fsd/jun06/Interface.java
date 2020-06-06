package org.imarticus.fsd.jun06;

//Interface can contain only abstract methods, no need to use abstract keyword in interface.
//Class extends many interfaces
//Class implements many interfaces
//interface extends many interfaces

interface Int1 {
	void m3();
}

abstract class Test9 {
	abstract void m1();
}

class Test10 implements Int1{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
}

public class Interface {

}
