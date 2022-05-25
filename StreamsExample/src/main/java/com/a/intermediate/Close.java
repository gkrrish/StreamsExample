package com.a.intermediate;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class Close {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		//closing Stream
		//we can't do further operations on streams
		list.stream().close();

	}

}
