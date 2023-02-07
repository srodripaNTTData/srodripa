package com.example.Bootcampdia2.Facade;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PersonFacade {
	
 private String name; 
 private int age;
 
 public String verDetalle() {
  return String.format("DNI: %s\nLicencia: %s%s", 
    name,age);
 }
 
}
