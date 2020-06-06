package org.imarticus.fsd.jun06;

interface University{
	void admission();
}

class College1 implements University{

	@Override
	public void admission() {
		
	}
	
}

class College2 implements University{

	@Override
	public void admission() {
		
	}
	
}

public class AM_Inheritance {
	public static void main(String[] args) {
		//ClassName objName = new ClassName();    ---Constructor
		//InterfaceName objName = new ClassName();
		University obj1 = new College1();
		University obj2 = new College2();
		obj1 = obj2;
		}
}
