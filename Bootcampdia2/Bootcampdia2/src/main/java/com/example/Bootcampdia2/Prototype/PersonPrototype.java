package com.example.Bootcampdia2.Prototype;

import com.example.Bootcampdia2.Prototype.Clonable;;

public class PersonPrototype implements Cloneable {

	private String name;
	private int age;
	
	public PersonPrototype() {}
	
	private PersonPrototype(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public PersonPrototype clone() {
		return new PersonPrototype(name,age);
	}
}
