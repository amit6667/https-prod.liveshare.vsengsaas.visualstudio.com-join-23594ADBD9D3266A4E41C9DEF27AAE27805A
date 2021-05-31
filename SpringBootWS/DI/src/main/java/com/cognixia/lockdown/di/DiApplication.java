package com.cognixia.lockdown.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx =SpringApplication.run(DiApplication.class, args);
		
//		Lockdown ld = new LockDown2();
//		ld.printDuration();
		
		
		Lockdown ld = (Lockdown) ctx.getBean("lockdown");
		ld.printDuration();
	}
	
	

}
