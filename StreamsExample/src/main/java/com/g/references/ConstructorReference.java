package com.g.references;

import java.util.function.Function;

public class ConstructorReference {
	public static void main(String[] args) {
		Function<String, Temp> temp = Temp::new;

		Temp tempApply = temp.apply("JOhn");
		System.out.println(tempApply);

	}//creating the constructor reference we are bypassing to constructor reference
	//if we want to create the constructor reference holding object should be funcational interface
	//here, Function we have taken hare

}
//https://www.tutorialspoint.com/how-to-implement-a-constructor-reference-with-one-or-more-arguments-in-java
class Temp {
	private String name;

	public Temp(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Temp [name=" + name + "]";
	}
}
