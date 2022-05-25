package com.b.terminal;

import java.util.ArrayList;
import java.util.List;

import com.d.questions.Person;

public class AllMatch {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		

		//allMatch checks entire list /collection level, if every record match then only it will says true all match
		//even one not match also it will say false
		
		boolean allMatch = list.stream().allMatch((p)->p.getLocation().equalsIgnoreCase("hyderabad"));
		System.out.println(allMatch);
		
		boolean allMatch2 = list.stream().allMatch((p)->p.getGender().equalsIgnoreCase("female"));
		System.out.println(allMatch2);
	}

}
