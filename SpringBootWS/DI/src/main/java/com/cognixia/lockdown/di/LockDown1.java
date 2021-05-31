package com.cognixia.lockdown.di;

import org.springframework.stereotype.Component;

@Component
public class LockDown1 implements Lockdown {
	
	@Override
	public void printDuration() {
		System.out.println("Started from 24th March 2020 till 6th August 2020");
	}

}
