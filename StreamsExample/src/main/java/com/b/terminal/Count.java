package com.b.terminal;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class Count {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		//count is a terminal method which will give how many records are there in collection/list
		long count = list.stream().count();
//		System.out.println(count);
		
		long count2 = list.stream().filter(p->p.getGender().equals("male")).count();
		System.out.println(count2);
		
	}
}
