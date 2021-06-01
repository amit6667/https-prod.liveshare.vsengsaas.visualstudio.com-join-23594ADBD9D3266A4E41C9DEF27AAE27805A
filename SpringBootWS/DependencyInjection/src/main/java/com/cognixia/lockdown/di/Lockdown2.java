package com.cognixia.lockdown.di;

import org.springframework.stereotype.Component;

@Component
public class Lockdown2 implements Lockdown{

	@Override
	public void printDuration() {
		System.out.println("45 days");
	}

}
