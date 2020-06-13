package org.imarticus.fsd.jun13;

import java.util.Vector;

public class VectorDemo2 {
	public static void main(String[] args) {
		
		//Vector(Initial Capacity, Incremental Capacity) 
		Vector v = new Vector(4, 3);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		v.add(10);
		v.add(10);
		v.add(10);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.add(10);
		v.add(10);
		v.add(10);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
	}
}
