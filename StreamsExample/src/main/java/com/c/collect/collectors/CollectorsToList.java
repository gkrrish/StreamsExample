package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class CollectorsToList {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
//		list.stream().map(p->p.getName()).collect(Collectors.toList()).forEach(System.out::println);
		List<String> collect = list.stream().map(p->p.getName()).collect(Collectors.toList());
		System.out.print(collect);
	}
}
