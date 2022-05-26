package com.f.lamda.defaultmethods.function;

import java.util.function.Function;

public class AndThen {
	public static void main(String[] args) {
		Function<String, String> function=(s)->s+" Hi";
		Function<String, String> function2=(s)->s+"Hello";
//		String apply = function.apply("John");
//		System.out.println(apply);
		
		String apply = function.andThen(function2).apply("John");
		System.out.println(apply);
	}

	//s+" "+HiHello -----s will be print only once
}
//https://stackoverflow.com/questions/43849066/java-8-functions-compose-and-andthen