package org.imarticus.fsd.jun06;

class Employee1{
	private int eid;
	private String name;
	private double salary;
	
	public Employee1(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}	
}

public class toString {
	public static void main(String[] args) {
		Employee1 obj = new Employee1(101, "Anant", 14.5);
		
		//By default toString method provides object location in memory. To get the data, you need to override the method.
		System.out.println(obj.toString());
	}

}
