package com.example.Bootcampdia2.Proxy;

public abstract class AbastractPersonProxy implements ProxyInterface {
	
	private ProxyInterface person;
	
	public AbastractPersonProxy(ProxyInterface person) {
		this.person = person;
	}
	
	public void operacion() {
		before();
		person.operacion();
		after();
	}
	
	public abstract void before();
	
	public abstract void after();

}
