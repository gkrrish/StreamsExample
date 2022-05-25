package com.a.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class FlatMap {
	// https://mkyong.com/java8/java-8-flatmap-example/

	public static void main(String[] args) {
		Map<Integer, List<String>> cHashMap = new ConcurrentHashMap<>();
		cHashMap.put(1, Arrays.asList("John", "Anna", "Alexa", "Jenifer"));
		cHashMap.put(2, Arrays.asList("Smith", "James", "Mary", "Robert"));
		cHashMap.put(3, Arrays.asList("Michael", "Linda", "David", "Elizabeth"));
		cHashMap.put(4, Arrays.asList("William", "Barbara", "Richard", "Susan"));
		cHashMap.put(5, Arrays.asList("Joseph", "Jessica", "Thomas", "Sarah"));
		cHashMap.put(6, Arrays.asList("Charles", "Karen", "Christopher", "Lisa"));
		cHashMap.put(7, Arrays.asList("Daniel", "Nancy", "Matthew", "Betty"));
		cHashMap.put(8, Arrays.asList("Anthony", "Margaret", "Mark", "Emily"));
		
//		FlatMap will be used for Flatten the Collection of Collections
//		Example : List<List<String>>() then we are making as single List<Stirng>
		cHashMap.entrySet().stream().filter(c->c.getKey()==5).flatMap(c->c.getValue().stream()).forEach(System.out::println);
		
		List<String> collect = cHashMap.entrySet().stream().flatMap(c->c.getValue().stream()).collect(Collectors.toList());
		System.out.println(collect);

	}
}
