package com.g.references;

import java.util.function.Predicate;

public class MethodReference {
	public static void main(String[] args) {
		Predicate <Integer> voter = MethodReference::isEligible;
        System.out.println(voter.test(16));
	}
	
	static boolean isEligible(int age) {
		if(age>=18)
			return true;
		return false;
	}
	
	//instead of creating the lamda, just we are bypassing the implementation to another method,
	//and method reference we are passing in place of lamda implementation

}//shttps://www.studytonight.com/java-8/java-predicate
