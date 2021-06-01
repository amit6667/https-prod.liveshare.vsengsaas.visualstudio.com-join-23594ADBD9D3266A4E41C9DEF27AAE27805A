package com.cognixia.lockdown.di;

import org.springframework.stereotype.Component;

@Component("Lockdown1")
//@Scope("singleton")
//@Scope("prototype")
public class Lockdown1 implements Lockdown{
	
	public String duration ="3months";
	
	public void printDuration() {
		
		System.out.println("Lockdown1 ran for " + duration);
	}
}
