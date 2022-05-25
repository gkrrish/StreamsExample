package com.b.terminal;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class AnyMatch {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		
		//anyMatch checks, in entire list or collection if any one value match with given value
		//then it will return true, if not matched anything then returns false
		
		
		boolean anyMatch = list.stream().anyMatch(p->p.getLocation().equalsIgnoreCase("Bangalore"));
		System.out.println(anyMatch);
		
		boolean anyMatch2 = list.stream().anyMatch(p->p.getGender().equalsIgnoreCase("male"));
		System.out.println(anyMatch2);
		
	}

}
