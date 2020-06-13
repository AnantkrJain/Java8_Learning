package org.imarticus.fsd.jun13;

class Student{
	
}

class MyClass<Student>{
	Student obj;
	void m(Student obj) {
		
	}
}

public class GenericDemo {
	public static void main(String[] args) {
		
		Student obj = new Student();
		MyClass myClass = new MyClass();
		myClass.m(obj);
	}
}
