package com.b.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.d.questions.Person;

public class Reduce {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));

		// it will accumulative into a single String
		// If we give int as a input then it will return int accumulative concatenation
		// value

		Optional<String> reduce = list.stream().map(p -> p.getName()).reduce((name1, name2) -> name1 + " " + name2);
		if (reduce.isPresent()) {
			String name = reduce.get();
			System.out.println(name);
		}

	}
}
