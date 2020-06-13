package org.imarticus.fsd.jun13;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack stack = new Stack();
		System.out.println(stack.size());
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		System.out.println(stack);
		
		System.out.println(stack.size());
		System.out.println(stack.pop());
		System.out.println(stack);
		
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack);
		
		System.out.println(stack.size());
		System.out.println(stack.lastElement());
	}
}
