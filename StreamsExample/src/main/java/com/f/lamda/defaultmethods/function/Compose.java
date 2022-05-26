package com.f.lamda.defaultmethods.function;

import java.util.function.Function;

public class Compose {
	public static void main(String[] args) {
		Function<String, String> function = (s) -> s + " Hi";
		Function<String, String> function2 = (s) -> s + "Hello";
		
		String apply = function.compose(function2).apply("John");
		System.out.println(apply);
		
		//s+""+Hello Hi
		
		//Comparison between f.andThen(f1).apply("John") vs f.compare(f1).apply("John")
		//input will be print only one time irrespective of methods
		//in andThen f first then f1 will be print,
		//in compare f1 first then f will be print,
		//quite inverse each other.
	}
}
