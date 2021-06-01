package com.cognixia.lockdown.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	public String name="Faiz";
	
	@Autowired
	@Qualifier("Lockdown1")
	Lockdown ld1; 

	
	public void run() {
//		System.out.println(name);
		ld1.printDuration();
	}
}
