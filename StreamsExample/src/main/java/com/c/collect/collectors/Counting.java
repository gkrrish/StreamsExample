package com.c.collect.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Counting{
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
		//while coming to the Collect(Collectors) to send output as a Collection, it is counting how many
		//things are there. just like count
		//Stream count() vs Collectors counting()
		//Stream count is counting for streamed values.
		//Collectors counting the out values count, out value mean, after completing the stream which values are 
		//saving into another collection
		
		Long collect2 = list.stream().map(p->p.getName()).collect(Collectors.counting());
		System.out.println(collect2);
		
	}
}
