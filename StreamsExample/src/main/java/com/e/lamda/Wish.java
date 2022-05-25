package com.e.lamda;

public class Wish {
	public static void main(String... args) {

		Greeting greeting = () -> System.out.println("Hello, Good Morning");
		greeting.greet();

	}

}
