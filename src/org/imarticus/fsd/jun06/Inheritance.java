package org.imarticus.fsd.jun06;

//Inheritance - acquire properties of parents, for code re-usability

class Phone{
	void call() {
		System.out.println("Calling...");
	}
	void sms() {
		System.out.println("Sending SMS...");
	}
}

class Smartphone extends Phone{
	void camera() {
		System.out.println("Taking pics...");
	}
}

class AdvancedPhone extends Smartphone {
	
}
//One class can't extend two classes but can implement multiple interfaces.

public class Inheritance {
	public static void main(String[] args) {
		Phone obj = new Phone();
		obj.call();
		obj.sms();
		Smartphone obj2 = new Smartphone();
		obj2.call();
		obj2.camera();
	}
}
