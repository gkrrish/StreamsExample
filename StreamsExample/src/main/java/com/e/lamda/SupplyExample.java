package com.e.lamda;

import java.util.function.Supplier;

public class SupplyExample {
	public static void main(String[] args) {
		Supplier<String> supplier = () -> "Howdy!, Stranger";
		
		String greeting = supplier.get();
		System.out.println(greeting);
	}

}
