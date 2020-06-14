package org.imarticus.fsd.jun14;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationWrite {
	public static void main(String[] args) throws IOException {
		
		String file = "D:/Eclipse_workspace/emp.ser";
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Employee employee = new Employee(101, "Anant", 9606061612L, 13.5);
		oos.writeObject(employee);
		System.out.println(employee.toString());
	}
}
