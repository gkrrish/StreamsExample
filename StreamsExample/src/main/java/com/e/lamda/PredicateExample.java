package com.e.lamda;

import java.util.function.Predicate;

public class PredicateExample {
	public static void main(String[] args) {
		String[] area = { "Hyderabd", "Chennai", "Bangalore", "Mumbai", "Delhi", "Kolkatta" };
		
		Predicate<String> booleanPredicate = (areas) -> areas.contains("a");
		for (String place : area) {
			if (booleanPredicate.test(place)) {
				System.out.println(place);
			}
		}

	}
}
