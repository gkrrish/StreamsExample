package com.d.questions;

import java.util.stream.Stream;

public class ArrayToStreamConversion {
	public static void main(String[] args) {
		String[] names = { "John", "Anna", "Smith", "Jenifer" };
		Stream<String> of = Stream.of(names);
		
		
				of.forEach(System.out::println);
	}

}
