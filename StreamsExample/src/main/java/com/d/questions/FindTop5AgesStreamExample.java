package com.d.questions;

import java.util.ArrayList;
import java.util.List;

public class FindTop5AgesStreamExample {
	public static void main(String[] args) {
		List<Person> list=new ArrayList<>(0);
		list.add(new Person("John1", 11, "male", "Hyderabad"));
		list.add(new Person("John2", 5, "male", "Hyderabad"));
		list.add(new Person("John3", 44, "male", "Hyderabad"));
		list.add(new Person("John4", 29, "male", "Hyderabad"));
		list.add(new Person("John5", 66, "male", "Hyderabad"));
		list.add(new Person("John6", 34, "male", "Hyderabad"));
		list.add(new Person("JOhn7", 26, "male", "Hyderabad"));
		list.add(new Person("John8", 77, "male", "Hyderabad"));
		list.add(new Person("John9", 8, "male", "Hyderabad"));
		list.add(new Person("John10", 3, "male", "Hyderabad"));
		list.add(new Person("JOhn11", 2, "male", "Hyderabad"));
		
		list.stream().sorted((p1,p2)->p1.getAge()-p2.getAge()).limit(5).forEach(System.out::println);
		
	}

}
