package com.example.Bootcampdia2.Singleton;

public class PersonSingleton {

	private static PersonSingleton instance = null;
	private String name;
	private int age;
	
	public PersonSingleton() {}
	
	private PersonSingleton(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static PersonSingleton getInstance() {
		if (instance == null) {
			instance = new PersonSingleton();
		}
		return instance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}
