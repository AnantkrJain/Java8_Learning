package org.imarticus.fsd.jun20;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 
 * @author ANANT K. JAIN
 *	Types of Functional Interface - 
 *	Function(WAWR), Predicate(WAWR but returns only boolean), Consumer(WANR), Supplier(NAWR)
 *
 */

public class FunctionalInterface {
	public static void main(String[] args) {
		
		Function<Integer, Integer> function = num1 -> num1 + 1;
		System.out.println(function.apply(10));
		
		Predicate<Integer> predicate = num -> {
			if(num%2 == 0) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println(predicate.test(11));
		
		Consumer<Integer> consumer = num -> System.out.println(num);
		consumer.accept(500);
		
		Supplier<Integer> supplier = () -> 18;
		System.out.println(supplier.get());
	}
}
