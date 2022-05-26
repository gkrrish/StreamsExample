package com.f.lamda.defaultmethods.predicate;

import java.util.function.Predicate;

public class IsEqual {
	public static void main(String[] args) {
		
		Predicate<String> predicate=Predicate.isEqual("John");
		boolean test = predicate.test("John");
		System.out.println(test);
		
		
		
		// https://www.studytonight.com/java-8/java-predicate
		//https://www.youtube.com/watch?v=2C3Aq5-ab48
	}
}
