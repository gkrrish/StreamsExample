package com.a.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.d.questions.Person;

public class Filter {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		Person person = list.stream().filter(p->p.getAge()>20).findFirst().get();
//		System.out.println(person);
		
//		list.stream().filter(p->p.getAge()>20).limit(2).forEach(System.out::println);
		
		Stream<Person> limit = list.stream().filter(p->p.getAge()>20).limit(2);
		System.out.println(limit);
		
		
	}

}
