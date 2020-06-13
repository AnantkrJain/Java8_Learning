package org.imarticus.fsd.jun13;

import java.util.TreeSet;

public class SetDemo2 {
	public static void main(String[] args) {
	
		//Tree Set doesn't store null element.
		
		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(40);
		ts.add(10);
		ts.add(50);
		System.out.println(ts);
		System.out.println(ts.size());
	}
}
