package org.imarticus.fsd.jun13;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo1 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		LinkedHashSet linkedHashSet = new LinkedHashSet();
		
		//Set has three types - Hash Set, Linked Hash Set, Tree Set
		//Set doesnot allow duplication
		
		//Does not maintain order
		hashSet.add(10);
		hashSet.add(20);
		hashSet.add(30);
		hashSet.add(10);
		hashSet.add(40);
		hashSet.add(50);
		hashSet.add(10);
		hashSet.add(null);
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		hashSet.add(25);
		hashSet.add(35);
		System.out.println(hashSet);
		System.out.println(hashSet.size());
		
		//maintains order
		linkedHashSet.add(10);
		linkedHashSet.add(20);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(40);
		linkedHashSet.add(50);
		System.out.println(linkedHashSet);
	}
}
