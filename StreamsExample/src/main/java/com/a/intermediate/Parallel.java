package com.a.intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.d.questions.Person;

public class Parallel {
	public static void main(String[] args) throws InterruptedException {
		List<Person> list = new ArrayList<>(0);
		list.add(new Person("John ", 33, "male", "hyderabad"));
		list.add(new Person("Anna", 20, "female", "hyderabad"));
		list.add(new Person("Alexa", 28, "female", "hyderabad"));
		list.add(new Person("Janifer", 19, "female", "hyderabad"));
		
//		list.parallelStream().forEach(System.out::println);
		
		for(int i=0; i<=10; i++) {
			Thread.sleep(1000);
			List<String> collect = list.parallelStream().map(Person::getName).collect(Collectors.toList());
			System.out.println(i+" "+collect);
			//generally this result will be vary based on computer multi-core mechanism, and semaphore cycle
			
		}
	}
}
/*
 * 0 [John , Anna, Alexa, Janifer]
 * 1 [John , Janifer, Alexa,Anna ]
 * 2 [John , Alexa, Anna, Janifer]
 * 
 * like unordered result will come, because we are performing parallel streams/like a multi threading operation.
 */
