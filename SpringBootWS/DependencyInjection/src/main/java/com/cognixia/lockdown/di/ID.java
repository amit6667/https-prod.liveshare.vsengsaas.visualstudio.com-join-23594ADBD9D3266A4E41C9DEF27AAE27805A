package com.cognixia.lockdown.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ID implements Lockdown{

	@Override
	public void printDuration() {
		System.out.println("From ID");
	}

}
