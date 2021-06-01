package com.cognixia.lockdown.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	public String name="Faiz";
	
	@Autowired
	Lockdown ld1; 

	
	public void run() {
//		System.out.println(name);
		ld1.printDuration();
	}
}
