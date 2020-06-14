package org.imarticus.fsd.jun14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationRead {
	public static void main(String[] args) throws IOException, Exception {
		
		String file = "D:/Eclipse_workspace/emp.ser";
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.toString());
	}
}
