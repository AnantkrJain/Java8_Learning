package org.imarticus.fsd.jun13;

import java.util.ArrayList;
import java.util.List;

class Employee{
	int eid;
	String name;
	double salary;
	
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
}

public class CollectionImp {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		Employee emp = new Employee();
		list.add(emp);
		Employee emp2 = new Employee(101, "Anant", 13.5);
		list.add(emp2);
		
		System.out.println(list.get(1));
	}
}
