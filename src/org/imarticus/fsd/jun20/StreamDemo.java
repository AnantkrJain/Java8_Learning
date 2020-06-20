package org.imarticus.fsd.jun20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101, "Anant", 18.5));
		empList.add(new Employee(102, "Arpita", 8.5));
		empList.add(new Employee(103, "Ankita", 3.5));
		empList.add(new Employee(104, "Ambrish", 9.5));
		empList.add(new Employee(105, "Samarpita", 5.5));
		
		System.out.println(empList);
		
		System.out.println("\nusing iterator method");
		Iterator<Employee> empIt = empList.iterator();
		while(empIt.hasNext()) {
			System.out.println(empIt.next());
		}
		
		System.out.println("\nusing forEach method with anonymous inner class");
		empList.forEach(new Consumer<Employee>() {
			public void accept(Employee emp) {
				System.out.println(emp.toString());
			}
		});
		
		System.out.println("\nusing forEach with lambda function");
		empList.forEach(emp->System.out.println(emp.toString()));
		
		System.out.println("\nConvert List to Stream");
		Stream<Employee> empStream = empList.stream();
		
		System.out.println("\nConvert from Stream to List");
		System.out.println(empStream.collect(Collectors.toList()));
		
		/*
		 * Streams are introduced in JAVA 8 and it is very helpful in performing operations unlike collections.
		 * Stream has multiple predefined methods like filter, skip, limit etc.
		 * Object created for stream methods can only be used once
		 */
		
		System.out.println("\nusing filter() method");
		Stream<Employee> empWithHigherSalary = empList.stream().filter(emp-> emp.salary>7.5);
		empWithHigherSalary.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("\nusing skip() method");
		Stream<Employee> skipFirstThreeEmp = empList.parallelStream().skip(3);
		skipFirstThreeEmp.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("\nSalary Hike using Collection");
		List<Double> salaryHike = empList.stream().map(emp -> emp.salary += 0.5).collect(Collectors.toList());
		salaryHike.forEach(emp -> System.out.println(emp.toString()));
		
		System.out.println("\nNames Capitalize using Collection");
		List<String> names = empList.stream().map(emp -> emp.name.toUpperCase()).collect(Collectors.toList());
		names.forEach(emp -> System.out.println(emp.toString()));
		
		//IntStreams are used when you want to work with primitive data types.
	}
}







