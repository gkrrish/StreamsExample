package com.b.terminal;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class NoneMatch {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		//noneMatch will return true if given value not match with list/collection even single value also
		//if anything match then returns true, we are checking against not match
		
		boolean noneMatch = list.stream().noneMatch(p->p.getLocation().equalsIgnoreCase("chennai"));
		System.out.println(noneMatch);
		
		boolean noneMatch2 = list.stream().noneMatch(p->p.getLocation().equalsIgnoreCase("hyderabad"));
		System.out.println(noneMatch2);
	}
}
