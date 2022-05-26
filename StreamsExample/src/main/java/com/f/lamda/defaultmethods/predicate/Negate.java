package com.f.lamda.defaultmethods.predicate;

import java.util.function.Predicate;

import com.d.questions.Person;

public class Negate {
	public static void main(String[] args) {
		Person person = new Person("John", 33, "male", "Hyderabad");

		Predicate<Person> predicate = (p) -> p.getAge() < 40;
		boolean test = predicate.negate().test(person);
		boolean test2 = predicate.test(person);
		System.out.println("test : "+test);
		System.out.println("test1 : "+test2);
		
		//just opposes the boolean

	}

}
