package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class CollectorsToMap {
//https://stackabuse.com/guide-to-java-8-collectors-tomap/
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		Map<Integer, String> collect = list.stream().collect(Collectors.toMap(p->p.getAge(), p->p.getName()));
//		System.out.println(collect);
		Map<Integer, Person> collect2 = list.stream().collect(Collectors.toMap(Person::getAge, Function.identity()));
		System.out.println(collect2);
		
	}
	
}
