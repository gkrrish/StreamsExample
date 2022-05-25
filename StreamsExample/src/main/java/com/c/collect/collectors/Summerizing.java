package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Summerizing {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 10, "male", "hyderabad"));
		list.add(new Person("Anna", 10, "female", "hyderabad"));
		list.add(new Person("Alexa", 10, "female", "hyderabad"));
		list.add(new Person("Janifer", 11, "female", "hyderabad"));
		
		//aggregating all the values
		
		Long collect = list.stream().collect(Collectors.summingLong(p->p.getAge()));
		System.out.println(collect);
	}
}
