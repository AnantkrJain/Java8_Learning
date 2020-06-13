package org.imarticus.fsd.jun13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {
		
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
		
		arrayList.remove(1);
		System.out.println(arrayList);
		
		arrayList.remove("50");
		System.out.println(arrayList);
		
		System.out.println("---------------");
		System.out.println(arrayList.size());
		System.out.println(arrayList.contains(20));
		System.out.println(arrayList.contains(30));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.isEmpty());
		System.out.println("---------------");
		
		System.out.println("Iterator- Efficient");
		Iterator iterator = arrayList.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("For loop - Not for heterogeneous data");
		for(int i=0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("---------------");
		
		arrayList.clear();
		System.out.println(arrayList.isEmpty());
		
		arrayList.removeAll(arrayList);
		System.out.println(arrayList);
		System.out.println(arrayList.size());
	}
}
