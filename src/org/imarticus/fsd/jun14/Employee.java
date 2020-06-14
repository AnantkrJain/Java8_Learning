package org.imarticus.fsd.jun14;

import java.io.Serializable;

public class Employee implements Serializable{
	
	public int eid;
	public String name;
	public long phone;
	public transient double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String name, long phone, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", phone=" + phone + ", salary=" + salary + "]";
	}
	
	
}
