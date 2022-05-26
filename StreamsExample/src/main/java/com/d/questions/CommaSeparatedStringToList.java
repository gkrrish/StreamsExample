package com.d.questions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommaSeparatedStringToList {
	public static void main(String[] args) {
		String string = "1,2,3,4,5";
		
		List<Integer> collect = Stream.of(string.split(","))
//									  .map(s->s.trim())//map expecting Function interface implementation--transformation
									  .map(String::trim)
									  .map(Integer::parseInt)
									  .collect(Collectors.toList());
		
		System.out.println(collect);
		
		//method references making code again simple here.
	}

}
//https://theoneamin.medium.com/useful-java-streams-d48266effe59