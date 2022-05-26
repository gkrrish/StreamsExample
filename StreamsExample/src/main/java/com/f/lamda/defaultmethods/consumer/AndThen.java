package com.f.lamda.defaultmethods.consumer;

import java.util.function.Consumer;

public class AndThen {

	public static void main(String[] args) {

		Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
		c.andThen(c).andThen(c).accept("John");
		
		//internally it will be called like , c.accept("John") c.accept("John") c.accept("John")

	}
}
//https://stackoverflow.com/questions/44237079/how-consumer-andthen-method-works-internally-in-java-functional-interfaces