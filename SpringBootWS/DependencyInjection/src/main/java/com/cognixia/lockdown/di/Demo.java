package com.cognixia.lockdown.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	public String name="Faiz";
	
	
	// This is known as Property Injection
//	@Autowired
//	@Qualifier("ID")
	Lockdown ld; 
	
	public String name="Faiz";

//	// This is known as Setter Injection
	// Avoid this at all cost
//	@Autowired
//	public void setLockdown(@Qualifier("Lockdown1") Lockdown ld) {
//		this.ld=ld;
//		System.out.println(ld.getClass());
//	}
	
	
	// This is known as Constructor Injection
	// This is recommended as the best practice
	@Autowired
	public Demo(@Qualifier("Lockdown1")Lockdown ld) {
		System.out.println("Constructor 1");
		this.ld = ld;
	}
	
	public Demo(Lockdown ld, String name) {
		System.out.println("Constructor 2");
		this.ld = ld;
		this.name=name;
	}
	
	public void run() {
//		System.out.println(name);
		ld.printDuration();
	}
}
