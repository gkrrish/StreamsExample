package com.b.terminal;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.d.questions.Person;

public class Min {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		
		Optional<Person> min = list.stream().filter(p->p.getGender().equals("female")).min((p1,p2)->p1.getAge()-p2.getAge());
		
		if(min.isPresent()) {
			Person youngPerson=min.get();
			System.out.println(youngPerson.toString());
		}
		
	}
}
