package com.f.lamda.defaultmethods.function;

import java.util.function.Function;

public class Identify {
	public static void main(String[] args) {
		Function<Object, Object> identity = Function.identity();
		Object apply = identity.apply("John");
		System.out.println(apply);
	}
	
	
	
	

	//whenever we dont want to provide implementation for Funcational interface
	//then just we pass the Function.Identify()
	
}//https://javabydeveloper.com/java-8-identity-function-examples/
