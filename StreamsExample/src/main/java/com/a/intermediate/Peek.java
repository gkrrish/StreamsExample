package com.a.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Peek {
	// https://howtodoinjava.com/java8/java-stream-peek-example/
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));

		// peek() will be used for debugging purpose, in general practice we will do
		// System.out.println() right
		// to see the intermediate result/debug point in between operations, hence peek also used like that
		
		List<String> collect = list.stream()
								   .map(p -> p.getName().concat("  Good morning  "))
								   .peek(System.out::print)
								   .map(s -> s.replace('n', 'X'))
								   .peek(System.out::println)
								   .collect(Collectors.toList());

		System.out.println("**** " + collect);

	}
}
