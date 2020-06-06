package org.imarticus.fsd.jun06;

//Method overriding - non-static within sub-super class, same method signature but with different method body

class featurePhone{
	void music() {
		System.out.println("Play music");
	}
	//overridden
	void camera() {
		System.out.println("Take pics");
	}
}

class androidPhone extends featurePhone{
	void camera() {
		//overriding
		System.out.println("Take HD pics");
	}
}
public class Overriding {
	public static void main(String[] args) {
		androidPhone obj = new androidPhone();
		obj.camera();
		obj.music();
	}
}
