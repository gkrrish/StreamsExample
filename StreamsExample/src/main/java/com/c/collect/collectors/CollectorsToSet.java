package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class CollectorsToSet {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
//		list.stream().map(p->p.getName()).collect(Collectors.toSet()).forEach(System.out::println);
		
		Set<String> collect = list.stream().map(p->p.getName()).collect(Collectors.toSet());
//		System.out.print(collect);
		
		Long collect2 = list.stream().map(p->p.getName()).collect(Collectors.counting());
		System.out.println(collect2);
	}

}
