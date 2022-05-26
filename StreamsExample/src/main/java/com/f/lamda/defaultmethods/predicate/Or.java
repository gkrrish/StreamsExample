package com.f.lamda.defaultmethods.predicate;

import java.util.function.Predicate;

import com.d.questions.Person;

public class Or {
	public static void main(String[] args) {
		Person person = new Person("John", 33, "male", "Hyderabad");

		Predicate<Person> predicate = (p) -> p.getAge() < 40;
//		boolean test = predicate.test(person1);
//		System.out.println(test);
		
		Predicate<Person> predicate2=(p)->p.getAge()>35;//change to 20 for false check
		
		boolean test = predicate.or(predicate2).test(person);
		System.out.println(test);
		
		
		//similar like OR operation, but it is dealing with Predicates T AND T = F   F AND T= T
		
	}

}
