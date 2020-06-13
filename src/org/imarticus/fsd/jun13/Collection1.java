package org.imarticus.fsd.jun13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Collection1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		LinkedList list2 = new LinkedList();
		
		//Preferred Way
		//Interface-name object-name = new class-name 
		List obj1 = new LinkedList();
		List obj2 = new ArrayList();
		
		System.out.println(list);
		list.add(10);
		list.add(10.5);
		list.add("abc");
		System.out.println(list);
		
		list2.add(10);
		System.out.println(list2);
	}
}
