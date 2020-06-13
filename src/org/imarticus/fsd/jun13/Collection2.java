package org.imarticus.fsd.jun13;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		
		//Preferred Way
		//Interface-name object-name = new class-name
		List arrayList = new ArrayList();
		
		//add an element
		arrayList.add(10);
		arrayList.add(20);
		System.out.println(arrayList);
		
		//add an collection
		arrayList.addAll(arrayList);
		System.out.println(arrayList);
		
		arrayList.add(2, 50);
		System.out.println(arrayList);
		
		List l1 = new ArrayList();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		
		List l2 = new ArrayList();
		l2.add(15);
		l2.add(25);
		l2.add(35);
		l2.addAll(l1);
		System.out.println(l2);
		l2.addAll(2, l1);
		System.out.println(l2);
	}
}
