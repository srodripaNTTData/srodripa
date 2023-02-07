package com.example.Bootcampdia2.Facade;

public class Person20 {

	private PersonFacade person20;
	
	public Person20(String name) {
		person20.builder().name(name).age(20).build();
	}
	
	 public String verDetalle() {
		  return person20.verDetalle();
	 }
	 
}
