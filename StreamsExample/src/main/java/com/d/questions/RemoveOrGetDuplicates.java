package com.d.questions;

import java.util.Arrays;
import java.util.List;

public class RemoveOrGetDuplicates {
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(1,1,2,3,4,4,5);
		
		numbers.stream().distinct().forEach(System.out::println);

	}
}//https://theoneamin.medium.com/useful-java-streams-d48266effe59
