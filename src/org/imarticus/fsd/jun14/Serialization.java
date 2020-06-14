package org.imarticus.fsd.jun14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	static void writeEmployee() throws Exception {
		String file = "D:/Eclipse_workspace/emp2.ser";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee employee = new Employee(102, "Arpita", 7355189501L, 13.5);
		oos.writeObject(employee);
		System.out.println(employee.toString());
	}
	
	static void readEmployee() throws Exception {
		String file = "D:/Eclipse_workspace/emp2.ser";
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.toString());
	}
	
	public static void main(String[] args) throws Exception{
		Serialization.writeEmployee();
		Serialization.readEmployee();
	}
}
