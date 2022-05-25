package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Grouping {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		list.add(new Person("Smith", 19, "female", "hyderabad"));
		list.add(new Person("Marry", 19, "female", "hyderabad"));
		
		Map<Integer, List<Person>> collect = list.stream().collect(Collectors.groupingBy(p->p.getAge()));
		System.out.println(collect);
	}
}
