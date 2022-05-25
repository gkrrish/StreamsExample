package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class ThrowException {
	//https://dzone.com/articles/exception-handling-in-java-streams
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));

		List<Integer> collect = list.stream().map(p -> {
			try {
				return p.getAge() / 0;
			} catch (Exception e) {
				throw new RuntimeException("Something went wrong...");
			}

		}).collect(Collectors.toList());
		System.out.println(collect);//exception occurs here

	}
}
