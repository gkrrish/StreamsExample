package com.a.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Limit {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		List<Person> collect = list.stream().limit(2).collect(Collectors.toList());
		System.out.println(collect);
	}

}
