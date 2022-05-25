package com.e.lamda;

import java.util.function.Function;

public class FuncationalExample {
	public static void main(String[] args) {
		Function<String, String> f1 = (s) -> s.toUpperCase();
		System.out.println(f1.apply("John"));
	}

}
