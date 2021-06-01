package com.cognixia.lockdown.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {
//	public String name="Faiz";
	
	@Autowired
	Lockdown1 ld1; 
	@Autowired
	Lockdown1 ld2; 
	
	public void run() {
//		System.out.println(name);
		ld1.duration="2 Months";
		ld1.printDuration();
		ld2.printDuration();
	}
}
