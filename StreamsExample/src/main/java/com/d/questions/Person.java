package com.d.questions;

public class Person {
	private String name;
	private Integer age;
	private String gender;
	private String location;

	public Person(String name, Integer age, String gender, String location) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getLocation() {
		return location;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", location=" + location + "]";
	}

}
