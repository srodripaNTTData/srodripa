package com.example.Bootcampdia2.Builder;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.example.Bootcampdia2.Prototype.PersonPrototype;
import com.example.Bootcampdia2.Singleton.PersonSingleton;

import lombok.*;



@Configuration
public class Config {

	@Bean(name = "personPrototype")
	@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public PersonPrototype singletonPerson() {
		return new PersonPrototype();
	}
	
	@Bean(name = "personSingleton")
	@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public PersonSingleton prototipePerson() {
		return new PersonSingleton();
	}
	
}
