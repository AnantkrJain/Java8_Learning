package org.imarticus.fsd.jun06;

//encapsulation - bind data(variables) and code(method) together
//make variables as private and create getter/setter methods to access them

class Bank{
	//data
	private int accountNumber;
	private int name;
	private double balance;
	
	//code
	double getBalance() {
		return this.balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
}

public class EnCapDemo {
	public static void main(String[] args) {
		Bank obj = new Bank();
		obj.setBalance(100);
		System.out.println(obj.getBalance());
		obj.setBalance(200);
		System.out.println(obj.getBalance());
	}
}
