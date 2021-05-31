package com.cognixia.lockdown.di;

import org.springframework.stereotype.Component;

@Component("lockdown")
public class LockDown2 implements Lockdown{
	@Override
	public void printDuration() {
		System.out.println("Started from 26th March to 1st June 2021");
	}
}
