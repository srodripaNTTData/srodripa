package com.example.Bootcampdia2.Decorator;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDecorator implements IPerson{
	
	private IPerson iperson;
	
	public PersonaDecorator(IPerson iperson) {
		this.iperson = iperson;
	}
	
	private String name;
	private int age;
	
	public int sumar() {
		return age+2;
	}
	
	public String escribir() {
		return name.trim();
	}
	
}
