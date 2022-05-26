package com.d.questions;

import java.util.Arrays;
import java.util.List;

public class FindFromList {
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("John","Smith","Emma","Anna");
		String orElse = list.stream()
							.filter(s->s.equalsIgnoreCase("Emma"))
							.findAny().orElse(null);
		System.out.println(orElse);
	}

}
//https://theoneamin.medium.com/useful-java-streams-d48266effe59