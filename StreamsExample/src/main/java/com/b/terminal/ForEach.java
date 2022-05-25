package com.b.terminal;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class ForEach {
	public static void main(String[] args) {

		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
//		list.stream().filter(p->p.getLocation()!=null).forEach(System.out::println);
		
		list.stream().filter(p->p.getGender().equals("female")).forEach(System.out::println);
		
		
	}
}
