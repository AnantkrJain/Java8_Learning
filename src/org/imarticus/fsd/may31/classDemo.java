package org.imarticus.fsd.may31;

//OOP
//Class and object - OOP

class bankCustomer{
	//entity template
	
	int acNo;
	String name;
	long phone;
	double balance;
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
}

class Employee {
	
	int eid;
	String name;
	double salary;
	
	Employee() {
		
	}
	
	Employee(int eid, String name, double salary) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	
	Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}
	
	void work() {
		System.out.println("Working....");
	}
}

public class classDemo {
	//entity: class, properties: variables, functionalities: methods
	public static void main(String[] args) {
		
		Employee obj = new Employee();
		obj.eid = 101;
		obj.name = "Anant";
		obj.salary=100000;
		
		System.out.println("Employee Details ----- \n" + obj.name + " " + obj.eid + " " + obj.salary);
		
		Employee obj2 = new Employee();
		obj2.name = "Vishruta";
		obj2.eid = 102;
		obj2.salary=100000;
		System.out.println("obj2.name");
		
		//Lot of repetition is there
		
		Employee obj3 = new Employee(103, "Arpita", 90000);
		System.out.println(obj3.name + " " + obj3.eid + " " + obj3.salary);
		
		Employee obj4 = new Employee(104, "Samarpita");
		System.out.println("Employees whose salary is not decided yet");
		System.out.println(obj4.name + " " + obj4.eid);
	}
}
