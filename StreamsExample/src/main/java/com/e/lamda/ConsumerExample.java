package com.e.lamda;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer1 = (name) -> System.out.println(name + ", Good Mrng..!!");
		consumer1.accept("John");
	}

}
