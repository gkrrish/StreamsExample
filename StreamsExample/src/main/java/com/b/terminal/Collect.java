package com.b.terminal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Collect {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));

		// collect is a terminal method and will be given values to Collection.

		Collection<Person> set = list.stream().collect(Collectors.toSet());
//		System.out.println(set);

		List<String> collect = list.stream().map(Person::getName).collect(Collectors.toList());
//		System.out.println(collect);

		Set<String> collect2 = list.stream().map(p -> p.getName() + " " + p.getLocation()).collect(Collectors.toSet());
//		System.out.println(collect2);
		
		TreeSet<String> collect3 = list.stream().map(p->p.getName()).collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(collect3);
		
		TreeSet<String> collect4 = list.stream().map(p->p.getLocation()).collect(Collectors.toCollection(TreeSet::new));
//		System.out.println(collect4);
		
		Map<String, List<Person>> collect5 = list.stream().collect(Collectors.groupingBy(p->p.getGender()));
//		System.out.println(collect5);
		
		String collect6 = list.stream().map(p->p.getName()).collect(Collectors.joining(","));
		System.out.println(collect6);
		
		
	}
}
